package net.kumato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// TODO change to singleton
public class Database {

    Connection connection = null;
    Statement statement = null;

    /**
     * TODO
     * @throws ClassNotFoundException
     * @throws SQLException
     */
	public Database() throws ClassNotFoundException, SQLException {

		// load the sqlite-JDBC driver using the current class loader
	    //TODO catch exception and exit application with an fatal error
	    Class.forName("org.sqlite.JDBC");

	    // create a database connection
	    // TODO put database name in a file with name in a property getConnection("jdbc:sqlite:kumato.db");
	    connection = DriverManager.getConnection("jdbc:sqlite::memory:"); // in memory database
	    statement = connection.createStatement();
	    statement.setQueryTimeout(30);  // set timeout to 30 sec.
	    
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
	public Contact getContactByName(String name) throws SQLException {
		Contact c = null;
		ResultSet rs = statement.executeQuery("select * from contact where name='" + name + "'");
		// change return type to contact list or throw error if more than one is found
		while(rs.next()) {
			c = new Contact(rs.getString("name"));
		}
		return c;
	}

}
