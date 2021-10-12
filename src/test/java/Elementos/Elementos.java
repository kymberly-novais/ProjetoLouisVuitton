package Elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elementos {

	WebDriver driver;
	

	{
	WebElement homem = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[1]/nav/ul/li[3]/button/span"));
	homem.click();
	homem.submit();
	}

	{
	WebElement relogio = driver.findElement(By.xpath("//*[@id=\"nvcat60003v-button\"]/span"));
	relogio.click();
	relogio.submit();
	}
	
	}
