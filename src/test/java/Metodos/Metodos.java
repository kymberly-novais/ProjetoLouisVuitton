package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Metodos {

	WebDriver driver;

	public void pesquisar(String texto, By elemento) {

		driver.findElement(elemento).sendKeys(texto);
	}
	
	public void submit (By elemento) {
		driver.findElement(elemento).submit();
	}
}
