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

WebUI.navigateToUrl('http://cms9dev.kellogg.northwestern.edu/programs/executive-mba.aspx')

WebUI.click(findTestObject('Page_EMBA Kellogg School of Management/Page_EMBA Program  Kellogg Executive MBA  Northwestern/a_Request-Information'))

WebUI.selectOptionByValue(findTestObject('Page_EMBA Kellogg School of Management/Page_Request Info  Kellogg Executive MBA  Northwestern/select_MissMrMrsMs'), 
    'M', true)

WebUI.setText(findTestObject('Page_EMBA Kellogg School of Management/Page_Request Info  Kellogg Executive MBA  Northwestern/input_First Name_form_17747b4d-ca66-4535-888f-6ae54ec552f1'), 
    'Zzmatthew')

WebUI.setText(findTestObject('Page_EMBA Kellogg School of Management/Page_Request Info  Kellogg Executive MBA  Northwestern/input_Last Name_form_1fa677e9-002a-4c92-9f0f-15bc67bbc28d'), 
    'Zzcacioppo')

WebUI.setText(findTestObject('Page_EMBA Kellogg School of Management/Page_Request Info  Kellogg Executive MBA  Northwestern/input_Email Address_form_1d826bb9-9f2c-4a1b-8cec-3987170bb4bb'), 
    'matthew.cacioppo@northwestern.edu')

WebUI.click(findTestObject('Page_EMBA Kellogg School of Management/Page_Request Info  Kellogg Executive MBA  Northwestern/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Page_EMBA Kellogg School of Management/Page_Request Information  Executive MBA Program  Kellogg School of Management/span_Request Information - Thank you'), 
    0)

WebUI.closeBrowser()

