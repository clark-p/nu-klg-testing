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

WebUI.navigateToUrl('http://cms9dev.kellogg.northwestern.edu/faculty/research.aspx')

WebUI.setText(findTestObject('Object Repository/input_View All Research_searchPublication'), 'frequency')

WebUI.sendKeys(findTestObject('Object Repository/input_View All Research_searchPublication'), Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_All-Research'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_All Departments'), '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_All Departments'), '0', true)

WebUI.click(findTestObject('Object Repository/i_View All Research_glyphicon glyphicon-search'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_All-Research'), '2', true)

WebUI.closeBrowser()

