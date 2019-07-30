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

WebUI.click(findTestObject('a_program-finder'))

WebUI.click(findTestObject('Object Repository/h3_Maximizing Sales Force Performance'))

WebUI.click(findTestObject('Object Repository/h3_Maximizing Sales Force Performance'))

WebUI.click(findTestObject('Object Repository/div_SAVE THISPROGRAM_1'))

WebUI.verifyElementPresent(findTestObject('Page_Executive Education Program Finder  Kellogg Executive Education/div_SAVE THISPROGRAM_1'), 
    0)

WebUI.mouseOver(findTestObject('Object Repository/a_The Kellogg Experience'))

WebUI.click(findTestObject('Object Repository/a_Saved Programs 2'))

WebUI.click(findTestObject('Object Repository/div_REMOVE THISPROGRAM'))

WebUI.click(findTestObject('Object Repository/span_Link back to program finder_opener klg-analytics-click'))

WebUI.click(findTestObject('Object Repository/span_Link back to program finder_opener klg-analytics-click active'))

WebUI.click(findTestObject('Object Repository/div_REMOVE THISPROGRAM_1'))

WebUI.verifyTextPresent('It looks like you haven\'t saved any programs yet.', false)

WebUI.click(findTestObject('Object Repository/a_Link back to program finder'))

WebUI.verifyTextPresent('Executive Education Program Finder', false)

