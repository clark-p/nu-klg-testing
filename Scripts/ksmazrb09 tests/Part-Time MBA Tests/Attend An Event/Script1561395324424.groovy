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

WebUI.navigateToUrl('http://ksmazrb09dev.kellogg.northwestern.edu/programs/part-time-mba')

WebUI.click(findTestObject('Page_Part-Time MBA Prgoram Kellogg School of Management/Page_Evening  Weekend Program  Part-Time MBA - Chicago  Kellogg School of Management/a_Attend an Event'))

WebUI.click(findTestObject('Page_Part-Time MBA Prgoram Kellogg School of Management/Page_Admissions Events  Kellogg Part-Time MBA  Northwestern/a_Register'))

WebUI.verifyElementPresent(findTestObject('Page_Part-Time MBA Prgoram Kellogg School of Management/Page_Evening  Weekend MBA Information Session Virtual/p_Registration is no longer available because the registration deadline has passed'), 
    0)

if (WebUI.verifyElementPresent(findTestObject('Page_Part-Time MBA Prgoram Kellogg School of Management/Page_Evening  Weekend MBA Information Session Virtual/p_Registration is no longer available because the registration deadline has passed'), 
    0) == true) {
    WebUI.click(findTestObject('Page_Part-Time MBA Prgoram Kellogg School of Management/Page_Evening  Weekend MBA Information Session Virtual/a_Kellogg School of Management'))
}

WebUI.closeBrowser()
