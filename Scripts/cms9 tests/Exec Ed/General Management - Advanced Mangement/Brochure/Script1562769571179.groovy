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

WebUI.navigateToUrl('http://cms9dev.kellogg.northwestern.edu/executive-education/individual-programs/executive-programs/amp-ii.aspx')

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_Advanced Management Program  Kellogg Executive Education/a_REQUEST A BROCHURE'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages_Exec Ed/Page_Request a Brochure  Kellogg Executive Education/select_-- None --    Mr    Ms    Mrs    Dr    Prof    Miss'), 
    'Mr.', true)

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Page_Request a Brochure  Kellogg Executive Education/input__first_name'), 
    'Zzmatthew')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Page_Request a Brochure  Kellogg Executive Education/input__last_name'), 
    'Zzcacioppo')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Page_Request a Brochure  Kellogg Executive Education/input__email'), 
    'matthew.cacioppo@northwestern.edu')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Page_Request a Brochure  Kellogg Executive Education/input_Phone Number_phone'), 
    '')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Page_Request a Brochure  Kellogg Executive Education/input__company'), 
    'THIS IS A TEST OF THE WEBSITE')

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_Request a Brochure  Kellogg Executive Education/span_Next'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_Request a Brochure  Kellogg Executive Education/input_ Back_submit'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_Thank You  Kellogg Executive Education/span_Thank You'))

WebUI.closeBrowser()

