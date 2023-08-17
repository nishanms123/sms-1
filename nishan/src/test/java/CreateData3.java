package nishan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateData2 {
	
	@Test(groups = "smoke")
	public void createData()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		EdgeOptions option=new EdgeOptions();
		option.addArguments("--disable--notifications");
		System.out.println("--create data---");
	}
	@Test(groups = "smoke")
	public void deleteData()
	{
		System.out.println("--delte data--");
	}
	@Test
	public void updateData()
	{
		System.out.println("--update data---");
	}

}
