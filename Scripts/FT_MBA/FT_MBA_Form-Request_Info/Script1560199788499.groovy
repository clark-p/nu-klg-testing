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

WebUI.navigateToUrl('http://cms9dev.kellogg.northwestern.edu/programs/full-time-mba.aspx')

ftmbaTitle = WebUI.getWindowTitle()

WebUI.verifyMatch(ftmbaTitle, 'Full-Time MBA Program | Kellogg School of Management', false)

WebUI.verifyElementClickable(findTestObject('Page_Full-Time MBA Program  Kellogg School of Management/a_Request Information'))

WebUI.click(findTestObject('Page_Full-Time MBA Program  Kellogg School of Management/a_Request Information'))

formFTMBATitle = WebUI.getWindowTitle()

WebUI.verifyMatch(formFTMBATitle, 'Brochure Request | Kellogg School of Management', false)

WebUI.focus(findTestObject('Page_Brochure Request  Kellogg School of Management/select_DrMissMrMrsMs'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Brochure Request  Kellogg School of Management/select_DrMissMrMrsMs'), 
    'F', true)

WebUI.setText(findTestObject('Object Repository/Page_Brochure Request  Kellogg School of Management/input_First Name'), 
    'zzPaula')

WebUI.setText(findTestObject('Object Repository/Page_Brochure Request  Kellogg School of Management/input_Preferred Name'), 
    'Paula')

WebUI.setText(findTestObject('Object Repository/Page_Brochure Request  Kellogg School of Management/input_Last Name'), 'zzClark')

WebUI.setText(findTestObject('Object Repository/Page_Brochure Request  Kellogg School of Management/input_Email Address_form'), 
    'paula.clark@northwestern.edu')

WebUI.setText(findTestObject('Object Repository/Page_Brochure Request  Kellogg School of Management/input_City_form_'), 
    'zzChicago')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Brochure Request  Kellogg School of Management/select_Select State'), 
    'IL', true)

WebUI.setText(findTestObject('Object Repository/Page_Brochure Request  Kellogg School of Management/input_Postal Code_form_postal'), 
    '60618')

WebUI.verifyElementClickable(findTestObject('Page_Brochure Request  Kellogg School of Management/button_Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Brochure Request  Kellogg School of Management/button_Submit'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Object Repository/Page_Request Information  Kellogg School of Management/label_Researching options'))

WebUI.click(findTestObject('Object Repository/Page_Request Information  Kellogg School of Management/div_MMM Program'))

WebUI.click(findTestObject('Object Repository/Page_Request Information  Kellogg School of Management/label_One-Year (1Y) MBA'))

WebUI.click(findTestObject('Object Repository/Page_Request Information  Kellogg School of Management/input_Two-Year (2Y) MBA_'))

WebUI.click(findTestObject('Object Repository/Page_Request Information  Kellogg School of Management/input_MMM Program_form_ef0663b2-7a78-4403-9b03-dc771e4dddf3'))

WebUI.click(findTestObject('Object Repository/Page_Request Information  Kellogg School of Management/input_Joint-Ventures'))

WebUI.click(findTestObject('Object Repository/Page_Request Information  Kellogg School of Management/input_Black-Management-Association'))

WebUI.click(findTestObject('Object Repository/Page_Request Information  Kellogg School of Management/input_Professional-Interests'))

WebUI.click(findTestObject('Object Repository/Page_Request Information  Kellogg School of Management/input_Accounting'))

WebUI.verifyElementClickable(findTestObject('Page_Request Information  Kellogg School of Management/button_Update'))

WebUI.click(findTestObject('Object Repository/Page_Request Information  Kellogg School of Management/button_Update'))

WebUI.closeBrowser()

