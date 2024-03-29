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

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_C-Suite Programs/Page_Corporate Governance Program  Kellogg Executive Education/div_SAVE THIS PROGRAM'))

if (WebUI.verifyElementPresent(findTestObject('Pages_Exec Ed/Page_C-Suite Programs/Page_Corporate Governance Program  Kellogg Executive Education/Page_Corporate Governance Program  Kellogg Executive Education/div_Thanks I got it'), 
    0, FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('Pages_Exec Ed/Page_C-Suite Programs/Page_Corporate Governance Program  Kellogg Executive Education/Page_Corporate Governance Program  Kellogg Executive Education/div_Thanks I got it'), 
        FailureHandling.OPTIONAL)
}

not_run: WebUI.click(findTestObject('Pages_Exec Ed/Page_C-Suite Programs/Page_Corporate Governance Program  Kellogg Executive Education/Page_Corporate Governance Program  Kellogg Executive Education/div_Thanks I got it'), 
    FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('Pages_Exec Ed/Page_C-Suite Programs/Page_Corporate Governance Program  Kellogg Executive Education/a_Individual Programs'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pages_Exec Ed/Page_C-Suite Programs/Page_Corporate Governance Program  Kellogg Executive Education/a_Saved Programs 1'), 
    0)

WebUI.navigateToUrl('http://cms9dev.kellogg.northwestern.edu/executive-education/saved-programs.aspx')

WebUI.click(findTestObject('Pages_Exec Ed/Page_C-Suite Programs/Page_Saved Programs  Kellogg Executive Education/div_REMOVE THISPROGRAM'))

WebUI.mouseOver(findTestObject('Pages_Exec Ed/Page_C-Suite Programs/Page_Saved Programs  Kellogg Executive Education/a_Individual Programs'))

WebUI.verifyElementPresent(findTestObject('Pages_Exec Ed/Page_C-Suite Programs/Page_Saved Programs  Kellogg Executive Education/a_Saved Programs 0'), 
    0)

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_C-Suite Programs/Page_Saved Programs  Kellogg Executive Education/h3_It looks like you havent saved any programs yet'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_C-Suite Programs/Page_Saved Programs  Kellogg Executive Education/a_program-finder'))

WebUI.closeBrowser()

