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

WebUI.click(findTestObject('Page_Kellogg Executive Education/a_program-finder'))

WebUI.getWindowTitle()

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Exec-Ed/select_UpcomingProgram Name'), 'program_name', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_More Programs'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_PrintSORT BYUpcomingProgram'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Exec-Ed/select_UpcomingProgram Name'), 'upcoming', true)

WebUI.closeBrowser()

