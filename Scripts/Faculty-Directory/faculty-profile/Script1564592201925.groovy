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

WebUI.setText(findTestObject('Object Repository/input_Contact_srch-term'), 'sally')

WebUI.click(findTestObject('Object Repository/button_Contact_btnfacultySearch'))

WebUI.waitForPageLoad(5)

facultyTitle = WebUI.getWindowTitle()

WebUI.verifyMatch(facultyTitle, 'Sally Blount - Faculty - Kellogg School of Management', false)

WebUI.closeBrowser()

