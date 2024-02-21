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

WebUI.navigateToUrl('https://www.strategyconnect.co/contact-us')

WebUI.click(findTestObject('Object Repository/Page_Contact StrategyConnect/h4_Team on-demand'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Contact StrategyConnect/select_-Select-Biotechnology  Life Sciences_7a4bdc'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Contact StrategyConnect/select_-Select-3 - 5 years5 - 8 years8 - 12_d4114c'), 
    '5 - 8 years', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Contact StrategyConnect/select_- Select -RemoteOn-SiteFlexible'), 
    'flexible', true)

WebUI.click(findTestObject('Object Repository/Page_Contact StrategyConnect/label_Full - Time'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Contact StrategyConnect/select_DaysDaysWeeksMonths'), 'month', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Contact StrategyConnect/input_Duration_qty_ciid'), '12')

WebUI.setText(findTestObject('Object Repository/Page_Contact StrategyConnect/input_Skills Required_skills_required_auto__a065ba'), 
    'be an expert')

WebUI.click(findTestObject('Object Repository/Page_Contact StrategyConnect/button_Save'))

WebUI.setText(findTestObject('Object Repository/Page_Contact StrategyConnect/input__role_ciid'), 'Manager')

WebUI.setText(findTestObject('Object Repository/Page_Contact StrategyConnect/input__number_of_consultants_ciid'), '3')

WebUI.click(findTestObject('Object Repository/Page_Contact StrategyConnect/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_Contact StrategyConnect/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Contact StrategyConnect/input_Title of Project_title_ciid'), 'Apex housing')

WebUI.click(findTestObject('Object Repository/Page_Contact StrategyConnect/span_Start date'))

WebUI.click(findTestObject('Object Repository/Page_Contact StrategyConnect/td_1'))

WebUI.click(findTestObject('Object Repository/Page_Contact StrategyConnect/span_End date'))

WebUI.click(findTestObject('Object Repository/Page_Contact StrategyConnect/button_13'))

WebUI.setText(findTestObject('Object Repository/Page_Contact StrategyConnect/textarea_Awesome project'), 'Awesome project')

WebUI.click(findTestObject('Object Repository/Page_Contact StrategyConnect/button_Next'))

WebUI.setText(findTestObject('Object Repository/Page_Contact StrategyConnect/input__email_ciid'), 'paul')

WebUI.setText(findTestObject('Object Repository/Page_Contact StrategyConnect/input_Company Name_company_name_ciid'), 'Lavae')

WebUI.setText(findTestObject('Object Repository/Page_Contact StrategyConnect/input_Contact Name_contact_name_ciid'), 'Paul Merson')

WebUI.setText(findTestObject('Object Repository/Page_Contact StrategyConnect/input__email_ciid'), 'paul@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Contact StrategyConnect/input_Phone number_number_ciid'), '1234567890')

WebUI.closeBrowser()

