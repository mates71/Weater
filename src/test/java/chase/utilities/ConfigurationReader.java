package chase.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

	private static Properties configFile;

	static {

		try {

			String configPath = "./src/test/resources/data_base/chase.properties";

			FileInputStream input = new FileInputStream(configPath);
			configFile = new Properties();
			configFile.load(input);
			input.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static String getProperty(String keyName) {

		return configFile.getProperty(keyName);

	}

}
