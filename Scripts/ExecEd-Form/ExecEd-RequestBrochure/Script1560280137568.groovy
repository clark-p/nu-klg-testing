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

WebUI.doubleClick(findTestObject('Page_Kellogg Executive Education/a_request-brochure-form'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/select_salutation'), 
    'Ms.', true)

WebUI.setText(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input__first_name'), 
    'zzPaula')

WebUI.setText(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input__last_name'), 
    'zzClark')

WebUI.setText(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input__email'), 'paula.clark@northwestern.edu')

WebUI.setText(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Phone Number_phone'), 
    '8325269955')

WebUI.setText(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input__company'), 'Northwestern University')

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_ExecutiveEd'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/div_Leadership'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input__00N32000003F50Q'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/div_Constructive Collaboration'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Leading Family Enterprises'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_High Performance Negotiation Skills'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Leading Into the Future'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/div_Operations  Technology Management'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Operations Management Week'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/div_Operations Management Week'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input__00N0d000003G22q'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/div_Online'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Essentials of Marketing Strategy'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Negotiating in a Virtual World'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_Collapse'))

WebUI.click(findTestObject('Object Repository/Page_Request a Brochure  Kellogg Executive Education/input_ Back_submit'))

WebUI.verifyTextPresent("Thank You", false)

WebUI.closeBrowser()

