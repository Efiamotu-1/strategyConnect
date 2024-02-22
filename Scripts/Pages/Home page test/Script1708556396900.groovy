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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_StrategyConnect/img'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_StrategyConnect/img'))

WebUI.mouseOver(findTestObject('Object Repository/Page_StrategyConnect/h5_Our Services'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_StrategyConnect/a_Service Package'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_StrategyConnect/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_StrategyConnect/a_Team On Demand'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_StrategyConnect/a_Industry Experts On Call'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_StrategyConnect/a_About Us'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_StrategyConnect/a_Join As Consultant'))

WebUI.mouseOver(findTestObject('Object Repository/Page_StrategyConnect/h5_Resources'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_StrategyConnect/a_Case Studies'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_StrategyConnect/a_Contact Us'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_StrategyConnect/button_Get Started'))

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/button_Get Started'))

WebUI.navigateToUrl('https://www.strategyconnect.co/')

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/button_Contact Us Now'))

WebUI.navigateToUrl('https://www.strategyconnect.co/')

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/div_View All Case Studies'))

WebUI.navigateToUrl('https://www.strategyconnect.co/')

WebUI.setText(findTestObject('Object Repository/Page_StrategyConnect/input'), 'musahabeebefy10@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/button_Send'))

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/img_1'))

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/img_1_2'))

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/a_Home'))

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/a_About'))

WebUI.click(findTestObject('Object Repository/Page_/a_Contact Us'))

WebUI.navigateToUrl('https://www.strategyconnect.co/')

WebUI.click(findTestObject('Object Repository/Page_/a_Join as Consultant (1)'))

WebUI.click(findTestObject('Object Repository/Page_Join As Consultant  StrategyConnect/a_Onboard Talent'))

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/a_Technical Due Diligence'))

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/a_Commercial Due Diligence'))

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/a_Investor Presentation'))

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/a_Go-To-Market Strategy'))

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/a_Financial Modeling'))

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/a_UIUX Audit Services'))

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/a_Case Study'))

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/a_Privacy Policy'))

WebUI.click(findTestObject('Object Repository/Page_StrategyConnect/a_Terms  Conditions'))

WebUI.click(findTestObject('Object Repository/Page_/a_Home'))

WebUI.closeBrowser()

