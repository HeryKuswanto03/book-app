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

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/Page_BookTracker - Your Personal Reading Companion/button_Home_flex flex-col items-center py-2_8e8901'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/Page_BookTracker - Your Personal Reading Companion/button_My Library_bg-blue-500 text-white p-_be0d2e'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/Page_BookTracker - Your Personal Reading Companion/input_Browse Library_w-full pl-10 pr-4 py-3_c2404c'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/Page_BookTracker - Your Personal Reading Companion/input_Browse Library_w-full pl-10 pr-4 py-3_c2404c_1'), 
    'l')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/Page_BookTracker - Your Personal Reading Companion/input_Browse Library_w-full pl-10 pr-4 py-3_c2404c_2'), 
    'lo')

WebUI.setText(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/Page_BookTracker - Your Personal Reading Companion/input_Browse Library_w-full pl-10 pr-4 py-3_c2404c_3'), 
    'lor')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Page_BookTracker - Your Personal Reading Companion/Page_BookTracker - Your Personal Reading Companion/input_Browse Library_w-full pl-10 pr-4 py-3_c2404c_4'), 
    'lord')

WebUI.delay(5)

WebUI.closeBrowser()

