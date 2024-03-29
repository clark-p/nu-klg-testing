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

WebUI.navigateToUrl('http://cms9dev.kellogg.northwestern.edu/')

WebUI.setText(findTestObject('Object Repository/Kellogg_Search/input_Kellogg School of Management at Northwestern University_layoutheader_0searchcomponent_0txtQuery'), 
    'test')

WebUI.click(findTestObject('Page_Kellogg School of Management  Northwestern University/button_btnglobalSearch'))

searchResultsTitle = WebUI.getWindowTitle(FailureHandling.STOP_ON_FAILURE)

WebUI.verifyMatch(searchResultsTitle, 'Search Results | Kellogg School of Management | Northwestern', false)

WebUI.closeBrowser()

