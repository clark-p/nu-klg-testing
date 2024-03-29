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

WebUI.verifyElementClickable(findTestObject('Page_Visit-Kellogg/Page_Full-Time MBA Program  Kellogg School of Management/a_Visit Kellogg'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Visit-Kellogg/Page_Full-Time MBA Program  Kellogg School of Management/a_Visit Kellogg'))

visitTitle = WebUI.getWindowTitle()

WebUI.verifyMatch(visitTitle, 'Campus Visits', false)

WebUI.verifyElementClickable(findTestObject('Page_Visit-Kellogg/Page_Campus Visits/a_Register to Visit'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Visit-Kellogg/Page_Campus Visits/a_Register to Visit'))

campusVisitTitle = WebUI.getWindowTitle()

WebUI.verifyMatch(campusVisitTitle, 'Kellogg School of Management - Full-Time MBA Campus Visit', false)

WebUI.closeBrowser()

