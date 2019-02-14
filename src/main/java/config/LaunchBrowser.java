package config;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class LaunchBrowser extends BaseTest {
	@BeforeClass
	@Parameters({ "url" })
	public void setup(String url) {
		setBrowser();
		driver.get(url);
	}

	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
