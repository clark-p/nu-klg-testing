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

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/h3_Topic Areas'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/label_Family Enterprise'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/label_Finance  Accounting'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_Select All                                                                                             General Management'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/label_Growth  Innovation'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_Select All                                                                                             General Management'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_Topic AreasSelect All                                                                                             General Management'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/label_Marketing  Sales'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/label_Online'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/h3_Management Levels'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/label_Junior-Level Executive'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/label_Mid-Level Executive'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_DATE RANGE FROM'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_July_picker__nav--next'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_22'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_DATE RANGE FROMJuly2019'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_16'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_DATE RANGE FROMJuly2019'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_August_picker__nav--next'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_September_picker__nav--next'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_October_picker__nav--next'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_November_picker__nav--next'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_22'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_SAVE THISPROGRAM'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_Thanks I got it'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_SAVE THISPROGRAM_1'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/div_SAVE THISPROGRAM_2'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/span_Register_opener klg-analytics-click'))

WebUI.click(findTestObject('Object Repository/Page_Exec-Ed/span_Clear All Filters'))

WebUI.closeBrowser()

