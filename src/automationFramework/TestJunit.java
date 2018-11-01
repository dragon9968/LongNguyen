package automationFramework;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import appModules.*;

class TestJunit {

	//@Before
	//void setUp() throws Exception {	
	  //  messageUtil = new MessageUtil("Hello World");
	//}

	
	String message = "Hello World";	
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test
	   public void testPrintMessage() {	  
	      assertEquals(message,messageUtil.printMessage());

}
}
