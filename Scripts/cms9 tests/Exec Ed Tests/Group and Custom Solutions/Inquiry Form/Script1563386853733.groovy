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

WebUI.navigateToUrl('http://cms9dev.kellogg.northwestern.edu/executive-education/group-and-custom-solutions/')

WebUI.click(findTestObject('Pages_Exec Ed/Group and Custom Solutions/Page_Group  Custom Solutions  Kellogg Executive Education/a_Inquiry Form'))

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/input_First Name _first_name'), 
    'Zzmatthew')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/input_Last Name _last_name'), 
    'Zzcacioppo')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/input_Title_title'), 
    '*THIS IS A TEST*')

WebUI.click(findTestObject('Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/input_Company _company'))

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/input_Title_title'), 
    '*THIS IS A TEST*')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/input_Company _company'), 
    '*THIS IS A TEST*')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/input_Department_00N60000002YFm5'), 
    '*THIS IS A TEST*')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/input_Email _email'), 
    'matthew.cacioppo@northwestern.edu')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/input_Phone_phone'), 
    '*THIS IS A TEST*')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/input_Mobile_mobile'), 
    '*THIS IS A TEST*')

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/span_Next'))

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/textarea_Street_street'), 
    '2211 Campus Drive')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/input_City_city'), 
    'Evanston')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/input_Postal Code_zip'), 
    '600')

WebUI.switchToWindowTitle('Custom Program Inquiry Form | Kellogg Executive Education')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/input_Postal Code_zip'), 
    '600')

WebUI.switchToWindowTitle('Custom Program Inquiry Form | Kellogg Executive Education')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/input_Postal Code_zip'), 
    '60208')

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/select_--None--Acre'), 
    'IL', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/select_--None--AfghanistanAland'), 
    'US', true)

WebUI.click(findTestObject('Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/span_Next_2'))

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/textarea_Describe your areas of interest'), 
    '*THIS IS A TEST*')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/textarea_Describe the profile'), 
    '*THIS IS A TEST*')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/textarea'), 
    '*THIS IS A TEST*')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/input_How many participants'), 
    '*THIS IS A TEST')

WebUI.setText(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/'), 
    '*THIS IS A TEST*')

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Custom Program Inquiry Form  Kellogg Executive Education/input_ Back_submit'))

WebUI.click(findTestObject('Object Repository/Pages_Exec Ed/Group and Custom Solutions/Page_Thank You  Kellogg Executive Education/span_Thank You'))

WebUI.closeBrowser()

