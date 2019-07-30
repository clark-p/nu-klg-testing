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

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Faculty Directory  Kellogg School of Management/Dept-Dropdown'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Faculty Directory  Kellogg School of Management/Dept-Dropdown'), 
    '6', true)

WebUI.click(findTestObject('Object Repository/Page_Faculty Directory  Kellogg School of Management/div_Faculty'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Faculty Directory  Kellogg School of Management/div_Faculty'), 
    5)

WebUI.click(findTestObject('Object Repository/Page_Faculty Directory  Kellogg School of Management/a_Eric T Anderson'))

WebUI.verifyTextPresent('Eric T. Anderson', false)

WebUI.closeBrowser()

