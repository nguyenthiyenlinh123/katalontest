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

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

// Step 1: Open the browser and navigate to the target URL
WebUI.openBrowser('')
WebUI.navigateToUrl('http://demoaut.katalon.com')

// Step 2: Perform any necessary actions (e.g., clicking a button)
WebUI.click(findTestObject('Page_CuraHomepage/btn_MakeAppointment'))
// Step 3: Capture the baseline image (only do this once to create the baseline)
String baselineImagePath = 'Images/Baseline/submit_result.png'
WebUI.takeScreenshot(baselineImagePath)

// Step 4: Take a current screenshot and compare it with the baseline
boolean isVisualMatch = WebUI.takeFullPageScreenshotAsCheckpoint(baselineImagePath)

// Step 5: Verify the visual match
if (isVisualMatch) {
	println('The visual checkpoint passed: the images match.')
} else {
	println('The visual checkpoint failed: the images do not match.')
}

// Step 6: Close the browser
WebUI.closeBrowser()
