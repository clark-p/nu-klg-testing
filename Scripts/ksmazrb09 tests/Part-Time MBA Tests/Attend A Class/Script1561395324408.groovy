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

WebUI.navigateToUrl('http://ksmazrb09dev.kellogg.northwestern.edu/programs/part-time-mba')

WebUI.click(findTestObject('Page_Part-Time MBA Prgoram Kellogg School of Management/Page_Evening  Weekend Program  Part-Time MBA - Chicago  Kellogg School of Management/a_class-visit-registration'))

WebUI.selectOptionByValue(findTestObject('Page_Part-Time MBA Prgoram Kellogg School of Management/Page_Visit an Evening  Weekend MBA Class  Kellogg School of Management/select_MrMs'), 
    'M', true)

WebUI.setText(findTestObject('Page_Part-Time MBA Prgoram Kellogg School of Management/Page_Visit an Evening  Weekend MBA Class  Kellogg School of Management/input_First Name_form_adf0aaec-aba7-4949-bb2f-cd930c746e6b'), 
    'Zzmatthew')

WebUI.setText(findTestObject('Page_Part-Time MBA Prgoram Kellogg School of Management/Page_Visit an Evening  Weekend MBA Class  Kellogg School of Management/input_Last Name_form_78e6e4a3-6020-496c-9894-57c3f5c6c8af'), 
    'Zzcacioppo')

WebUI.setText(findTestObject('Page_Part-Time MBA Prgoram Kellogg School of Management/Page_Visit an Evening  Weekend MBA Class  Kellogg School of Management/input_Email Address_form_43fabfc2-2251-4476-b93a-30221776c701'), 
    'matthew.cacioppo@northwestern.edu')

WebUI.click(findTestObject('Page_Part-Time MBA Prgoram Kellogg School of Management/Page_Visit an Evening  Weekend MBA Class  Kellogg School of Management/button_Submit'))

WebUI.closeBrowser()

