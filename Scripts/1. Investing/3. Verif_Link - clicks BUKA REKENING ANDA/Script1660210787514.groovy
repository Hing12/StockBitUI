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

WebUI.delay(5)
WebUI.sendKeys(null, Keys.chord(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN, 
        Keys.PAGE_DOWN, Keys.PAGE_UP))

WebUI.click(findTestObject('Object Repository/Investing/Page_Stockbit - Mulai Investasi Saham/a_Buka Rekening Anda'))
WebUI.delay(5)
WebUI.switchToWindowIndex(1)
Link= 'https://stockbit.com/register'
CurrentUrL= WebUI.getUrl()
WebUI.delay(3)
WebUI.verifyMatch(CurrentUrL, Link, false)
WebUI.delay(2)