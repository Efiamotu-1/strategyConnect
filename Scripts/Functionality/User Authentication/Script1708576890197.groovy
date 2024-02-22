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

WebUI.setText(findTestObject('Object Repository/Page_Strategy Connect/input_Email_email'), 'musahabeebefy@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Strategy Connect/input_Password_password'), 'jUUuFH2/WWJDoZMpzymiBw==')

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/span_Login with email'))

WebUI.setText(findTestObject('Object Repository/Page_Strategy Connect/input_Email_email'), 'musahabeebefy10@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/span_Login with email'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/img_User menu_ring-cyan-500 w-full h-full o_6522e4'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/span_Login with email'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/a_Forgot password'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/span_Reset password'))

WebUI.setText(findTestObject('Object Repository/Page_Strategy Connect/input_musahabeebefy10gmail.com_verify1'), '9')

WebUI.setText(findTestObject('Object Repository/Page_Strategy Connect/input_musahabeebefy10gmail.com_verify2'), '6')

WebUI.setText(findTestObject('Object Repository/Page_Strategy Connect/input_musahabeebefy10gmail.com_verify3'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Strategy Connect/input_musahabeebefy10gmail.com_verify4'), '6')

WebUI.setText(findTestObject('Object Repository/Page_Strategy Connect/input_musahabeebefy10gmail.com_verify5'), '6')

WebUI.setText(findTestObject('Object Repository/Page_Strategy Connect/input_musahabeebefy10gmail.com_verify6'), '9')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Strategy Connect/input_New Password_password'), 'jUUuFH2/WWJDoZMpzymiBw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Strategy Connect/input_Confirm Password_password_again'), 
    'jUUuFH2/WWJDoZMpzymiBw==')

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/span_Reset password'))

WebUI.setText(findTestObject('Object Repository/Page_Strategy Connect/input_Email_email'), 'musahabeebefy@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Strategy Connect/input_Password_password'), 'jUUuFH2/WWJDoZMpzymiBw==')

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/span_Login with email'))

WebUI.setText(findTestObject('Object Repository/Page_Strategy Connect/input_Email_email'), 'musahabeebefy10@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/button_Login with email'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/img_User menu_ring-cyan-500 w-full h-full o_6522e4'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_Strategy Connect/button_Login with Google'))

WebUI.switchToWindowTitle('Sign in - Google Accounts')

WebUI.setText(findTestObject('Object Repository/Page_Sign in - Google Accounts/input_strategyconnect.co_identifier'), 'musahabeebefy10@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in - Google Accounts/span_Next'))

WebUI.closeBrowser()

