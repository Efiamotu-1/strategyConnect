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

WebUI.navigateToUrl('https://www.strategyconnect.co/case-studies')

WebUI.setText(findTestObject('Object Repository/Page_/input'), 'agriculture')

WebUI.click(findTestObject('Object Repository/Page_/button_Search'))

WebUI.click(findTestObject('Object Repository/Page_/h5_Public sector'))

WebUI.click(findTestObject('Object Repository/Page_/h5_Education'))

WebUI.click(findTestObject('Object Repository/Page_/h5_Agriculture'))

WebUI.click(findTestObject('Object Repository/Page_/h5_Technology'))

WebUI.click(findTestObject('Object Repository/Page_/h5_Logistics'))

WebUI.click(findTestObject('Object Repository/Page_/h5_All Case Studies'))

WebUI.click(findTestObject('Object Repository/Page_/h3_Managing multiple vendors to run a start_3d9453'))

WebUI.delay(5)

WebUI.navigateToUrl('https://www.strategyconnect.co/case-studies')

WebUI.click(findTestObject('Object Repository/Page_/p_Prev. Page'))

