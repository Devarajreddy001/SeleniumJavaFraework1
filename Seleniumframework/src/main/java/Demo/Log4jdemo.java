package Demo;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jdemo {

	
	private static Logger logger = LogManager.getLogger(Log4jdemo.class);
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		System.out.println("\n hello world \n");
		
		logger.info("This is information message");
		logger.error("this is an error message");
		logger.warn("this is a warning message");
		logger.fatal("this is a afatal message");
	
		System.out.println("\n completed");

}
}