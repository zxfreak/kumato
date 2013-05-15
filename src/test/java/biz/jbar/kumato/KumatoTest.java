package biz.jbar.kumato;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class KumatoTest {

	Kumato k;
	
	@Before
	public void setUp() throws Exception{
		k = new Kumato();
	}
	
	@Test
	// get hello message
	public void getHelloMessage() throws Exception {
		assertEquals("Kumato says Hello!", k.hello());
	}

}
