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

WebUI.navigateToUrl('https://talent.strategyconnect.co/authentication/login')

WebUI.setText(findTestObject('Object Repository/Page_Strategy Connect/input_Email_email'), 'musahabeebefy10@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Strategy Connect/input_Password_password'), 'jUUuFH2/WWJDoZMpzymiBw==')

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/span_Login with email'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/button_Latest'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/input_Latest Jobs_default-radio-2'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/input_Old_default-radio-2'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/span_Filter'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/label_Remote'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/button_Apply Filter'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/span_Filter'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/label_On-site'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/button_Apply Filter'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/span_Filter'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/label_Full-Time'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/label_Remote'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/label_Remote'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/button_Apply Filter'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/span_Filter'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/label_Part-Time'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/label_On-site'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/label_Remote'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/label_On-site'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/label_On-site'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/label_Full-Time'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/label_On-site'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/button_Apply Filter'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/div_Filter'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/label_Full-Time'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/label_On-site'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/button_Apply Filter'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/span_Filter'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/label_Remote'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/button_Apply Filter'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/div_Filter'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/button_Reset'))

WebUI.closeBrowser()

