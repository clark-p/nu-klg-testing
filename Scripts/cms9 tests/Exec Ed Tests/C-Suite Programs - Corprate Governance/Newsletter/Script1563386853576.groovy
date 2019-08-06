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

WebUI.navigateToUrl('http://cms9dev.kellogg.northwestern.edu/executive-education/individual-programs/executive-programs/director/')

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_C-Suite Programs/Page_Corporate Governance Program  Kellogg Executive Education/a_SUBSCRIBE TO NEWSLETTER'))

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Page_C-Suite Programs/Page_Subscribe to our newsletter  Kellogg Executive Education/input_First Name _first_name'), 
    'Zzmatthew')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Page_C-Suite Programs/Page_Subscribe to our newsletter  Kellogg Executive Education/input_Last Name _last_name'), 
    'Zzcacioppo')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Page_C-Suite Programs/Page_Subscribe to our newsletter  Kellogg Executive Education/input_Email Address _email'), 
    'matthew.cacioppo@northwestern.edu')

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_C-Suite Programs/Page_Subscribe to our newsletter  Kellogg Executive Education/input_Email Address _submit'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_C-Suite Programs/Page_Thank You  Kellogg Executive Education/h1_Thank You'))

WebUI.closeBrowser()

