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

WebUI.focus(findTestObject('Page_Faculty Directory  Kellogg School of Management/select_All Departments-Initiatives'))

WebUI.verifyOptionPresentByLabel(findTestObject('Page_Faculty Directory  Kellogg School of Management/select_All Departments-Initiatives'), 
    'Marketing', false, 6)

WebUI.selectOptionByIndex(findTestObject('Page_Faculty Directory  Kellogg School of Management/select_All Departments-Initiatives'), 
    '6', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Eric T. Anderson', false)

mainFacultyIndex = WebUI.getWindowIndex()

WebUI.click(findTestObject('Object Repository/a_Eric T Anderson'))

WebUI.switchToWindowIndex(mainFacultyIndex + 1)

WebUI.waitForPageLoad(5)

andersonTitle = WebUI.getWindowTitle()

WebUI.verifyMatch(andersonTitle, 'Eric T. Anderson - Faculty - Kellogg School of Management', false)

WebUI.closeBrowser()

