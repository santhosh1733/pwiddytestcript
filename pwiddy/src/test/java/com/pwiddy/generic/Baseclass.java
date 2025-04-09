package com.pwiddy.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Baseclass {
	public static WebDriver driver;
	public static Filelib f=new Filelib();
 @Test
	public static void openBrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url = f.getpropertdata("url");
		driver.get(url);
	}

}
