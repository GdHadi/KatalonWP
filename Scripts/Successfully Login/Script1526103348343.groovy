import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qatesting123.wordpress.com/wp-admin')

WebUI.setText(findTestObject('Login/Page_Log Masuk  WordPress.com/input_usernameOrEmail'), Username)

WebUI.click(findTestObject('Login/Page_Log Masuk  WordPress.com/button_Lanjutkan'))

WebUI.waitForElementVisible(findTestObject('Login/Page_Log Masuk  WordPress.com/input_password'), 10)

WebUI.setText(findTestObject('Login/Page_Log Masuk  WordPress.com/input_password'), Password)

WebUI.click(findTestObject('Login/Page_Log Masuk  WordPress.com/button_Log Masuk'))

WebUI.verifyElementVisible(findTestObject('Login/Page_Dasbor  qatesting123  WordPres/img_avatar avatar-32'))

WebUI.closeBrowser()

