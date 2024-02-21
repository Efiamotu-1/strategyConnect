import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.strategyconnect.co/')

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/h5_Our Services'))

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/a_Service Package'))

WebUI.delay(5)

WebUI.navigateToUrl('https://www.strategyconnect.co/')

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/h5_Our Services'))

WebUI.click(findTestObject('Object Repository/Page_/a_Team On Demand'))

WebUI.delay(5)

WebUI.navigateToUrl('https://www.strategyconnect.co/')

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/h5_Our Services'))

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/a_Industry Experts On Call'))

WebUI.click(findTestObject('Object Repository/Page_/a_About Us'))

WebUI.click(findTestObject('Object Repository/Page_/a_Join As Consultant'))

WebUI.delay(3)

WebUI.navigateToUrl('https://www.strategyconnect.co/')

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/h5_Resources'))

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/a_Case Studies'))

WebUI.click(findTestObject('Object Repository/Page_/div_Contact Us'))

WebUI.delay(3)

WebUI.navigateToUrl('https://www.strategyconnect.co/')

WebUI.click(findTestObject('Object Repository/Page_/button_Get Started'))

WebUI.delay(5)

WebUI.closeBrowser()

