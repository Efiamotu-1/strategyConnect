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

WebUI.navigateToUrl('https://talent.strategyconnect.co/')

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/span_Login with email'))

WebUI.setText(findTestObject('Object Repository/Page_Strategy Connect/input_Email_email'), 'musahabeebefy10@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Strategy Connect/input_Password_password'), 'jUUuFH2/WWJDoZMpzymiBw==')

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/span_Login with email'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/a_View Jobs'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/span_Messages'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/a_View Jobs'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Strategy Connect/a_Join Now'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Strategy Connect/div_Join our whatsappTo stay updated'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/span_Messages'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/a_Profile'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/img_User menu_ring-cyan-500 w-full h-full o_6522e4'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/a_Settings'))

WebUI.closeBrowser()

