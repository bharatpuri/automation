package applicationFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.base.CustomException;
import com.automation.browser.Browser;

public class Locator {

	public static WebElement findElement(String element) throws CustomException {
		WebElement webElement = null;

		String loctor_type = element.split("=")[0].replace("\"", "");
		String locator_value = element.split("=", 2)[1].replace("\"", "");

		switch (loctor_type.trim()) {
		case "id": // Search the element with Id property

			webElement = Browser.getDriver().findElement(By.id(locator_value.trim()));

			break;
		case "name": // Search the element with Name property
			webElement = Browser.getDriver().findElement(By.name(locator_value.trim()));
			break;
		case "cssSelector": // Search the element with cssSelector property

			webElement = Browser.getDriver().findElement(By.cssSelector(locator_value.trim()));

			break;
		case "xpath": // Search the element with xpath property

			webElement = Browser.getDriver().findElement(By.xpath(locator_value.trim()));

			break;
		case "className": // Search the element with className property

			webElement = Browser.getDriver().findElement(By.className(locator_value.trim()));

			break;
		case "linkText": // Search the element with linkText property

			webElement = Browser.getDriver().findElement(By.linkText(locator_value.trim()));

			break;
		case "partialLinkText":// Search the element with partialLinkText
			// property

			webElement = Browser.getDriver().findElement(By.partialLinkText(locator_value.trim()));

			break;
		case "tagName": // Search the element with tagName property

			webElement = Browser.getDriver().findElement(By.tagName(locator_value.trim()));

			break;
		default: // Throw exception if any invalid WebElement is found
			throw new CustomException("Failed to find the locator" + loctor_type);
		}
		return webElement;
	}

	public static WebDriverWait waitForElement() {
		return new WebDriverWait(Browser.getDriver(), 120);
	}

}
