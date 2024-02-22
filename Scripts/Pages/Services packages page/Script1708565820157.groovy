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

WebUI.navigateToUrl('https://www.strategyconnect.co/service-packages')

WebUI.verifyElementText(findTestObject('Object Repository/Page_/p_Our service package offerings comprehensi_ba124d'), 'Our service package offerings comprehensively covers large institutions’ as well as early stage ventures\' and startups requirements to cater towards well-defined problem statements.')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_/button_Explore Our Solutions'))

WebUI.click(findTestObject('Object Repository/Page_/button_Explore Our Solutions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_/div_Investor Presentation'))

WebUI.click(findTestObject('Object Repository/Page_/div_Investor Presentation'))

WebUI.click(findTestObject('Object Repository/Page_/div_Financial Modeling'))

WebUI.click(findTestObject('Object Repository/Page_/div_Go-To-Market Strategy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_/a_Book Us Now'))

WebUI.click(findTestObject('Object Repository/Page_/a_Book Us Now'))

WebUI.delay(3)

WebUI.navigateToUrl('https://www.strategyconnect.co/service-packages')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_/button_Contact Us Now'))

WebUI.click(findTestObject('Object Repository/Page_/button_Contact Us Now'))

WebUI.delay(3)

WebUI.navigateToUrl('https://www.strategyconnect.co/service-packages')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_/div_View All Case Studies'))

WebUI.click(findTestObject('Object Repository/Page_/div_View All Case Studies'))

WebUI.delay(3)

WebUI.navigateToUrl('https://www.strategyconnect.co/service-packages')

WebUI.click(findTestObject('Object Repository/Page_/div_How does StrategyConnect ensure quality_62b541'))

WebUI.click(findTestObject('Object Repository/Page_/div_How does StrategyConnect ensure quality_62b541'))

WebUI.click(findTestObject('Object Repository/Page_/img_1'))

WebUI.delay(5)

WebUI.navigateToUrl('https://www.strategyconnect.co/service-packages')

WebUI.click(findTestObject('Object Repository/Page_/h3_Empowering Educational Excellence by Tra_82e082'))

WebUI.delay(5)

WebUI.navigateToUrl('https://www.strategyconnect.co/service-packages')

WebUI.click(findTestObject('Object Repository/Page_/h3_Revolutionizing Last-Mile Logistics by F_0c028f'))

WebUI.delay(5)

WebUI.navigateToUrl('https://www.strategyconnect.co/service-packages')

WebUI.click(findTestObject('Object Repository/Page_/h3_Empowering Early Childhood Development I_e14ffb'))

WebUI.delay(5)

WebUI.navigateToUrl('https://www.strategyconnect.co/service-packages')

WebUI.click(findTestObject('Object Repository/Page_/h3_Accelerating Technological Innovation an_03733d'))

WebUI.delay(5)

WebUI.navigateToUrl('https://www.strategyconnect.co/service-packages')

WebUI.closeBrowser()

