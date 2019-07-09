import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://cms9dev.kellogg.northwestern.edu/executive-education.aspx')

WebUI.click(findTestObject('Object Repository/a_program-finder'))

WebUI.click(findTestObject('Object Repository/span_SORT BY_opener klg-analytics-click'))

WebUI.click(findTestObject('Object Repository/div_SAVE THISPROGRAM'))

WebUI.click(findTestObject('Object Repository/div_Thanks I got it'))

WebUI.click(findTestObject('Object Repository/h3_Maximizing Sales Force Performance'))

WebUI.click(findTestObject('Object Repository/span_APPLY'))

WebUI.click(findTestObject('Object Repository/a_Continue Application'))

WebUI.setText(findTestObject('Object Repository/input_First (Given) Name_ctl00ContentPlaceHolder1tbxFirstName'), 'zz_Paula')

WebUI.setText(findTestObject('Object Repository/input_Last (Family) Name_ctl00ContentPlaceHolder1tbxLastName'), 'zz_Clark')

WebUI.setText(findTestObject('Object Repository/input_Preferred Email_ctl00ContentPlaceHolder1tbxEmail'), 'paula.clark@kellogg.northwestern.edu')

WebUI.setText(findTestObject('Object Repository/input_Company_ctl00ContentPlaceHolder1cc_227F50D0_F65B_4A72_9A4F_5060EA05F6AB__company'), 
    'Kellogg')

WebUI.click(findTestObject('Object Repository/input_Yes_ctl00ContentPlaceHolder1grHor_649EC475_7F46_4DAC_927F_CE735FEA657A__'))

WebUI.click(findTestObject('Object Repository/input_Yes_ctl00ContentPlaceHolder1grHor_1B4C956A_63BB_4704_B389_533605139492__'))

WebUI.click(findTestObject('Object Repository/input_Yes_ctl00ContentPlaceHolder1grHor_3DC71CA5_3B70_43DF_82BB_75C1B93DF2C8__'))

WebUI.click(findTestObject('Object Repository/td_Next'))

WebUI.click(findTestObject('Object Repository/a_Next'))

WebUI.getWindowTitle()

WebUI.closeBrowser()

