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

WebUI.verifyElementPresent(findTestObject('input_Contact_srch-term'), 5)

WebUI.setText(findTestObject('Object Repository/input_Contact_srch-term'), 'jeanne')

WebUI.click(findTestObject('Object Repository/button_Contact_btnfacultySearch'))

facultyPageTitle = WebUI.getWindowTitle()

facultyPageIndex = WebUI.getWindowIndex()

WebUI.verifyMatch(facultyPageTitle, 'Faculty Directory | Kellogg School of Management', false)

WebUI.verifyElementText(findTestObject('Page_Faculty Directory  Kellogg School of Management/a_Jeanne-Brett'), 'Jeanne Brett')

WebUI.verifyElementClickable(findTestObject('Page_Faculty Directory  Kellogg School of Management/a_Jeanne-Brett'))

WebUI.click(findTestObject('Page_Faculty Directory  Kellogg School of Management/a_Jeanne-Brett'))

WebUI.switchToWindowIndex(facultyPageIndex + 1)

WebUI.waitForPageLoad(5)

brettTitle = WebUI.getWindowTitle()

WebUI.verifyMatch(brettTitle, 'Jeanne Brett - Faculty - Kellogg School of Management', false)

WebUI.closeBrowser()

