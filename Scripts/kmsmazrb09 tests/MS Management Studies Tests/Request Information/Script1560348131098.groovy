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

WebUI.navigateToUrl('http://ksmazrb09dev.kellogg.northwestern.edu/programs/ms-management-studies ')

WebUI.click(findTestObject('Page_MS Management Kellogg School of Management/Page_MS in Management Studies  Kellogg School of Management/a_Request Information'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MS Management Kellogg School of Management/Page_Reach Higher with a Foundation in Business/select_DrMissMrMrsMs'), 
    'Dr', true)

WebUI.setText(findTestObject('Object Repository/Page_MS Management Kellogg School of Management/Page_Reach Higher with a Foundation in Business/input_First Name_form_6312e50f-4a54-4413-9788-f82b44a0b4b7'), 
    'zzMatthew')

WebUI.setText(findTestObject('Object Repository/Page_MS Management Kellogg School of Management/Page_Reach Higher with a Foundation in Business/input_Last Name_form_7e6f42cb-7266-40e4-879b-0634b7f03b4b'), 
    'ZZCacioppo')

WebUI.setText(findTestObject('Object Repository/Page_MS Management Kellogg School of Management/Page_Reach Higher with a Foundation in Business/input_Email Address_form_f3ecc52f-458c-41e8-abc8-88ac794c5702'), 
    'zzmatthew.cacioppo@northwestern.edu')

WebUI.setText(findTestObject('Object Repository/Page_MS Management Kellogg School of Management/Page_Reach Higher with a Foundation in Business/input_Undergraduate Institution Name_form_50757991-2d70-4071-8b15-5a905b6e91ff'), 
    'Northwestern University')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_MS Management Kellogg School of Management/Page_Reach Higher with a Foundation in Business/select_Consultingetc'), 
    'Technology', true)

WebUI.click(findTestObject('Object Repository/Page_MS Management Kellogg School of Management/Page_Reach Higher with a Foundation in Business/button_Submit'))

WebUI.closeBrowser()

