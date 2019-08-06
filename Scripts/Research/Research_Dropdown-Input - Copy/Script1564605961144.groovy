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

WebUI.navigateToUrl('https://www.kellogg.northwestern.edu/faculty/research.aspx')

facultyResearchTitle = WebUI.getWindowTitle()

WebUI.verifyMatch(facultyResearchTitle, 'Recent Scholarly Research | Kellogg School of Management', false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Kellogg-Research/select_All Departments'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Kellogg-Research/select_All Departments'), '11', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Kellogg-Research/select_All Research'), '2', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Kellogg-Research/select_All Departments'), '12', true)

WebUI.verifyElementPresent(findTestObject('Kellogg-Research/span_No results found'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Kellogg-Research/select_All Research'), '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Kellogg-Research/select_All Research'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Kellogg-Research/select_All Research'), '0', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/Kellogg-Research/td_Improving Retention'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Kellogg-Research/td_Improving Retention'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(8)

researchDetailsTitle = WebUI.getWindowTitle()

WebUI.verifyMatch(researchDetailsTitle, 'Recent Scholarly Research | Kellogg School of Management', 
    false)

WebUI.closeBrowser()

