package Utils;

import java.time.Duration;

public class Constants {

	public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "/drivers/chromedriver";
	
	public static final String GECKO_DRIVER_PATH = System.getProperty("user.dir") + "/drivers/geckodriver";
	
	public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir") + "/configs/conf.properties";

	public static final int IMPLICIT_WAIT = 10;
	
	public static final Duration EXPLICIT_WAIT_TIME = Duration.ofSeconds(10);

	

}
