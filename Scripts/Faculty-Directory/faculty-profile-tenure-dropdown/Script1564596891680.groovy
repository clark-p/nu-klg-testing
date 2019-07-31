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

WebUI.navigateToUrl('https://www.kellogg.northwestern.edu/faculty/faculty_directory.aspx')

WebUI.focus(findTestObject('Page_Faculty Directory  Kellogg School of Management/select_Tenure-line'))

WebUI.verifyOptionPresentByLabel(findTestObject('Page_Faculty Directory  Kellogg School of Management/select_Tenure-line'), 
    'Clinical', false, 3)

WebUI.selectOptionByIndex(findTestObject('Page_Faculty Directory  Kellogg School of Management/select_Tenure-line'), '3', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Brenda Ellington Booth', false)

mainFacultyIndex = WebUI.getWindowIndex()

WebUI.click(findTestObject('Page_Faculty Directory  Kellogg School of Management/h2_Brenda Ellington Booth'))

WebUI.switchToWindowIndex(mainFacultyIndex + 1)

WebUI.waitForPageLoad(5)

ellingtonTitle = WebUI.getWindowTitle()

WebUI.verifyMatch(ellingtonTitle, 'Brenda Ellington Booth - Faculty - Kellogg School of Management', false)

WebUI.closeBrowser()

