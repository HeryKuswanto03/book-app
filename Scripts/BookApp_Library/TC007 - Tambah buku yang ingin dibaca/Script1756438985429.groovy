import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/')

WebUI.click(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/button_Home_flex flex-col items-center py-2_8e8901'))

WebUI.click(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/button_My Library_bg-blue-500 text-white p-_be0d2e'))

WebUI.click(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/input_Browse Library_w-full pl-10 pr-4 py-3_c2404c'))

WebUI.setText(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/input_Browse Library_w-full pl-10 pr-4 py-3_c2404c_1'), 
    't')

WebUI.setText(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/input_Browse Library_w-full pl-10 pr-4 py-3_c2404c_2'), 
    'to')

WebUI.setText(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/input_Browse Library_w-full pl-10 pr-4 py-3_c2404c_3'), 
    'tol')

WebUI.setText(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/input_Browse Library_w-full pl-10 pr-4 py-3_c2404c_4'), 
    'tolk')

WebUI.setText(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/input_Browse Library_w-full pl-10 pr-4 py-3_c2404c_5'), 
    'tolki')

WebUI.setText(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/input_Browse Library_w-full pl-10 pr-4 py-3_c2404c_6'), 
    'tolkie')

WebUI.setText(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/input_Browse Library_w-full pl-10 pr-4 py-3_c2404c_7'), 
    'tolkien')

WebUI.click(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/button_Fantasy_absolute top-4 right-4 bg-gr_b4e9cf'))

WebUI.delay(10)

WebUI.closeBrowser()

