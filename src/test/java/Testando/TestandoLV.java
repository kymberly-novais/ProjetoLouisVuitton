package Testando;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import okhttp3.Cookie;

public class TestandoLV {

	WebDriver driver;

	@Dado("que esteja com o navegador aberto")
	public void que_esteja_com_o_navegador_aberto() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Quando("ao entrar no site {string}")
	public void ao_entrar_no_site(String appUrl) {
		driver.get(appUrl);

	}

	@Quando("irei selecionar a categoria Homem")
	public void irei_selecionar_a_categoria_homem() {
		WebElement homem = driver.findElement(By
				.cssSelector("#header > div > div.lv-header-navigation > nav > ul > li:nth-child(3) > button > span"));
		homem.click();

		driver.manage().window().setSize(new Dimension(1000, 800));

	}

	@Entao("entro na categoria Relogios e Joias")
	public void entro_na_categoria_relogios_e_joias() {
		WebElement relogio = driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div[1]/div[3]/header/div/div[1]/nav/ul/li[3]/div/div/ul/li[9]/button"));
		relogio.click();

		driver.close();
		
	}

}
