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

WebUI.click(findTestObject('Object Repository/a_program-finder'))

WebUI.click(findTestObject('Object Repository/h3_Essentials of Marketing Strategy'))

WebUI.click(findTestObject('Page_Exec-Ed/div_SAVE THISPROGRAM'))

if (WebUI.verifyElementText(findTestObject('Page_Kellogg Executive Education/Page_Executive Education Program Finder  Kellogg Executive Education/h3_Great Youve just saved your first program'), 
    'Great! You\'ve just saved your first program!')) {
    WebUI.verifyElementClickable(findTestObject('Page_Kellogg Executive Education/Page_Executive Education Program Finder  Kellogg Executive Education/div_Thanks I got it'))

    WebUI.click(findTestObject('Page_Kellogg Executive Education/Page_Executive Education Program Finder  Kellogg Executive Education/div_Thanks I got it'))
}

WebUI.click(findTestObject('Object Repository/h3_Essentials of Marketing Strategy'))

//if (WebUI.scrollToElement(findTestObject('Kellogg-Navigation/div_Toggle navigation'), 0)) {
//   
//    WebUI.mouseOver(findTestObject('Object Repository/a_The Kellogg Experience'))
//}
WebUI.scrollToElement(findTestObject('Kellogg-Navigation/div_Toggle navigation'), 3)

WebUI.mouseOver(findTestObject('Object Repository/a_The Kellogg Experience'))

WebUI.verifyElementClickable(findTestObject('Page_Executive Education Program Finder  Kellogg Executive Education/a_Saved Programs'), 
    FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementClickable(findTestObject('Object Repository/a_Saved Programs 1'), 30)
WebUI.click(findTestObject('Page_Executive Education Program Finder  Kellogg Executive Education/a_Saved Programs'))

WebUI.getUrl()

WebUI.verifyElementVisible(findTestObject('Page_Saved Programs  Kellogg Executive Education/div_Class Profile-Essentials'))

WebUI.click(findTestObject('Page_Saved Programs  Kellogg Executive Education/h3_Essentials of Marketing Strategy'))

WebUI.click(findTestObject('Page_Saved Programs  Kellogg Executive Education/div_REMOVE THISPROGRAM'))

WebUI.verifyElementText(findTestObject('Page_Saved Programs  Kellogg Executive Education/h3_It looks like you havent saved any programs yet'), 
    'It looks like you haven\'t saved any programs yet.')

WebUI.click(findTestObject('Object Repository/a_program-finder'))

WebUI.closeBrowser()

