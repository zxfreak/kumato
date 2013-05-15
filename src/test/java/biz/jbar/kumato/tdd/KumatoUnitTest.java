package biz.jbar.kumato.tdd;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import biz.jbar.kumato.Kumato;

public class KumatoUnitTest {

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
