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

WebUI.navigateToUrl('http://cms9dev.kellogg.northwestern.edu/Home/executive-education/individual-programs/executive-programs/OPSTRAT.aspx')

WebUI.click(findTestObject('Exec Ed IE/Page_Business Operations Strategy for Managers  Kellogg Executive Education/div_SAVE THIS PROGRAM'))

if (WebUI.verifyElementPresent(findTestObject('Pages_Exec Ed/Page_Online Programs/Page_Marketing Training  Kellogg Executive Education/div_Thanks I got it'), 
    0, FailureHandling.OPTIONAL) == true) {
    WebUI.click(findTestObject('Pages_Exec Ed/Page_Online Programs/Page_Marketing Training  Kellogg Executive Education/div_Thanks I got it'))
}

not_run: WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Saved_Programs_Consistency/Page_Advanced Management Program  Kellogg Executive Education/div_Thanks I got it'), 
    FailureHandling.OPTIONAL)

WebUI.mouseOver(findTestObject('Exec Ed IE/Page_Corporate Governance Program  Kellogg Executive Education/a_Individual Programs'))

WebUI.verifyElementPresent(findTestObject('Exec Ed IE/Page_Business Operations Strategy for Managers  Kellogg Executive Education/a_Saved Programs 1'), 
    0)

WebUI.click(findTestObject('Exec Ed IE/Page_Business Operations Strategy for Managers  Kellogg Executive Education/h3_Personal Consultation'))

WebUI.click(findTestObject('Exec Ed IE/Page_Business Operations Strategy for Managers  Kellogg Executive Education/a_Finance  Accounting'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Saved_Programs_Consistency/Page_Corporate Financial Management  Accounting  Kellogg Executive Education/a_LEARN MORE'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Saved_Programs_Consistency/Page_Corporate Finance  Investment Strategy  Kellogg Executive Education/div_SAVE THIS PROGRAM'))

WebUI.navigateToUrl('http://cms9dev.kellogg.northwestern.edu/executive-education/individual-programs/nonprofit-programs/np-people/')

WebUI.mouseOver(findTestObject('Pages_Exec Ed/Saved_Programs_Consistency/Page_Advanced Management Program  Kellogg Executive Education/a_Individual Programs'))

WebUI.verifyElementPresent(findTestObject('Pages_Exec Ed/Saved_Programs_Consistency/Page_Nonprofit Management and Leadership  Kellogg Executive Education Programs/a_Saved Programs 2'), 
    0)

WebUI.navigateToUrl('http://cms9dev.kellogg.northwestern.edu/executive-education/saved-programs.aspx')

WebUI.click(findTestObject('Exec Ed IE/Page_Saved Programs  Kellogg Executive Education/div_REMOVE THISPROGRAM'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Saved_Programs_Consistency/Page_Saved Programs  Kellogg Executive Education/div_REMOVE THISPROGRAM_1'))

WebUI.closeBrowser()

