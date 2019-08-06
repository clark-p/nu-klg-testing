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

WebUI.navigateToUrl('http://cms9dev.kellogg.northwestern.edu/executive-education/individual-programs/executive-scholars-certificate/')

WebUI.click(findTestObject('Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Certificate  Kellogg Executive Education/a_Apply'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/select_--None--    Mr    Ms    Mrs    Dr    Prof    Miss'), 
    'Mr.', true)

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/input__first_name'), 
    'Zzmatthew')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/input__last_name'), 
    'Zzcacioppo')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/input__email'), 
    'matthew.cacioppo@northwestern.edu')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/input__company'), 
    'THIS IS A TEST OF THE WEBSITE')

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/span_Next'))

WebUI.click(findTestObject('Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/div_Finance'))

WebUI.click(findTestObject('Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/input_Corporate Finance_00N32000003F50Z'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/input__00N32000002jfAW'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/input_Constructive Collaboration_00N32000003F50T'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/div_Advanced Marketing Management'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/input_Corporate Finance_00N32000003F50Z'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/input_Distribution Channel Management_00N32000002awWI'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/input_Driving Organizational Change_00N32000003F50x'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/input_Energizing People for Performance_00N32000002tYD0'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/input_Merger Week_00N32000003F50u'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/input_Operations Strategy_00N32000003F50S'))

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/textarea_concat(Women  s Director Development Program)_00N32000003F517'), 
    'THIS IS A TEST. PLEASE DISREGARD THIS FORM')

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Executive Scholar Application  Kellogg Executive Education/input_ Back_submit'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Page_Executive Scholar/Page_Thank You  Kellogg Executive Education/span_Thank You'))

WebUI.closeBrowser()

