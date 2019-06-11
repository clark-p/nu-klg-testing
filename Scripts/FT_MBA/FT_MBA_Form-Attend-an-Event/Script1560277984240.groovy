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

WebUI.click(findTestObject('Page_Kellogg Executive Education/a_request-brochure-form'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/select_prefix'), 
    'Ms.', true)

WebUI.setText(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input__first_name'), 
    'zzPaula')

WebUI.setText(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Middle Name'), 
    '')

WebUI.setText(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input__last_name'), 
    'zzClark')

WebUI.setText(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input__email'), 'paula.clark@northwestern.edu')

WebUI.setText(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Phone Number_phone'), 
    '123.456.7789')

WebUI.setText(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input__company'), 'Northwestern University')

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Executive Education'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input__00N32000003F50M'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input__00N32000003F50M'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/span_'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Advanced Management Program'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Business for Scientists and Engineers'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/div_Finance  Accounting'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Finance for Executives'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Corporate Finance'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input__00N32000003F50U'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/div_Governance'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Corporate Governance'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/div_Corporate Governance'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Family Enterprise Boards'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Negotiating in a Virtual World'))

WebUI.setText(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input__street'), 'zz1007 Church Street')

WebUI.setText(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input__city'), 'Chicago')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/select_selectCountry'), 
    'US', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/select_selectState'), 
    'IL', true)

WebUI.setText(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Postal Code_zip'), 
    '60618')

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_ Back_submit'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Address-Classification'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_ Back_submit'))

WebUI.closeBrowser()

