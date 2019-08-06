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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://ksmazrb09dev.kellogg.northwestern.edu/programs/part-time-mba')

WebUI.click(findTestObject('Page_Part-Time MBA Prgoram Kellogg School of Management/Part time MBA/Weekend Program  Part-Time MBA/a_Request Brochure'))

WebUI.selectOptionByValue(findTestObject('Page_Part-Time MBA Prgoram Kellogg School of Management/Part time MBA/Page_Request Information - Part-Time MBA Program/select_DrMissMrMrsMs'), 
    'Miss', true)

WebUI.setText(findTestObject('Page_Part-Time MBA Prgoram Kellogg School of Management/Part time MBA/Page_Request Information - Part-Time MBA Program/input_First Name _form_23333248-3df8-4884-8c37-b29ea74a28fa'), 
    'Zzmatthew')

WebUI.setText(findTestObject('Page_Part-Time MBA Prgoram Kellogg School of Management/Part time MBA/Page_Request Information - Part-Time MBA Program/input_Last Name _form_94bcc79d-a579-4b5c-b6c4-130bdb9e72a0'), 
    'Zzcacioppo')

WebUI.setText(findTestObject('Page_Part-Time MBA Prgoram Kellogg School of Management/Part time MBA/Page_Request Information - Part-Time MBA Program/input_Email Address _form_0e33f18f-4db2-4bdd-9126-f33deb66d5ce'), 
    'matthew.cacioppo@northwestern.edu')

WebUI.click(findTestObject('Page_Part-Time MBA Prgoram Kellogg School of Management/Part time MBA/Page_Request Information - Part-Time MBA Program/button_Submit'))

WebUI.closeBrowser()

