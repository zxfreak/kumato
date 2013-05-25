package net.kumato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/***
 * Database Singleton Class to encapsulate access to SQLite database 
 */
public class Database {

	private static Database databaseUniqueInstance;

	Connection connection = null;
    Statement statement = null;

    /**
     * @return Database Singleton Instance
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static synchronized Database getInstance() throws SQLException, ClassNotFoundException {
    	if (databaseUniqueInstance == null) {
    		databaseUniqueInstance = new Database();
    	}
    	return databaseUniqueInstance;
    }

    /**
     * Database constructor (singleton)
     * @throws ClassNotFoundException
     * @throws SQLException
     */
	private Database() throws ClassNotFoundException, SQLException {

		// load the sqlite-JDBC driver using the current class loader
	    Class.forName("org.sqlite.JDBC");

	    // create a database connection
	    // TODO put database name in a file with name in a property getConnection("jdbc:sqlite:kumato.db");
	    connection = DriverManager.getConnection("jdbc:sqlite::memory:"); // in memory database
	    statement = connection.createStatement();
	    statement.setQueryTimeout(30);  // set timeout to 30 sec.
	    
	    createTables();
	}

	/**
	 * TODO
	 */
	public void createTables() throws SQLException {
		// create tables
	    statement.executeUpdate("drop table if exists contact");
	    statement.executeUpdate("create table contact (name string)");
	}

	/**
	 * TODO
	 * @param c
	 * @throws SQLException
	 */
	public void putContact(Contact c) throws SQLException {
		statement.executeUpdate("insert into contact values('" + c.getName() + "')");
	}

	/**
	 * TODO
	 * @param name
	 * @return
	 * @throws SQLException 
	 */
	public ContactList getContactListByName(String name) throws SQLException {
		Contact contact = null;
		ContactList list = new ContactList();
		ResultSet rs = statement.executeQuery("select * from contact where name='" + name + "'");
		while(rs.next()) {
			contact = new Contact(rs.getString("name"));
			list.addLast(contact);
		}
		return list;
	}

}
