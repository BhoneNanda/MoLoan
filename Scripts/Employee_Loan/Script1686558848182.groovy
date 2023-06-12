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

Mobile.startApplication('C:\\Users\\USER\\Downloads\\MoMoney UAT.apk', false)

Mobile.delay(9)

Mobile.tap(findTestObject('Object Repository/Loan_Calculator/android.widget.TextView - No Thanks'), 0)

Mobile.delay(4)

Mobile.tap(findTestObject('Object Repository/Loan_Calculator/android.view.View'), false)

Mobile.setText(findTestObject('Object Repository/Loan_Calculator/android.widget.EditText'), '111222', 0)

Mobile.tap(findTestObject('Object Repository/Loan_Calculator/android.widget.TextView - Update Now'), 0)

Mobile.pressBack()

Mobile.delay(4)

Mobile.swipe(844, 1731,40, 1792)

Mobile.tap(findTestObject('Object Repository/Loan_Calculator/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Employee_Loan/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Employee_Loan/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Employee_Loan/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/Employee_Loan/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Employee_Loan/android.view.ViewGroup (3)'), 0)

Mobile.setText(findTestObject('Object Repository/Employee_Loan/android.widget.EditText'), 'Test', 0)

Mobile.tap(findTestObject('Object Repository/Employee_Loan/android.widget.TextView - Select marital status'), 0)

Mobile.tap(findTestObject('Object Repository/Employee_Loan/android.widget.TextView - Divorced'), 0)

Mobile.tap(findTestObject('Object Repository/Employee_Loan/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Employee_Loan/android.widget.TextView - Spouse'), 0)

Mobile.tap(findTestObject('Object Repository/Employee_Loan/android.widget.TextView - Select living status'), 0)

Mobile.tap(findTestObject('Object Repository/Employee_Loan/android.widget.TextView - Rental'), 0)

Mobile.setText(findTestObject('Object Repository/Employee_Loan/android.widget.EditText (1)'), '5', 0)

Mobile.setText(findTestObject('Object Repository/Employee_Loan/android.widget.EditText (2)'), '1', 0)

Mobile.tap(findTestObject('Object Repository/Employee_Loan/android.widget.TextView - Select division'), 0)

Mobile.tap(findTestObject('Object Repository/Employee_Loan/android.widget.TextView - Yangon'), 0)

Mobile.tap(findTestObject('Object Repository/Employee_Loan/android.view.ViewGroup (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Employee_Loan/android.widget.TextView - Botahtaung'), 0)

Mobile.setText(findTestObject('Object Repository/Employee_Loan/android.widget.EditText (3)'), 'Test', 0)

Mobile.setText(findTestObject('Object Repository/Employee_Loan/android.widget.EditText (4)'), '123456', 0)

Mobile.tap(findTestObject('Object Repository/Employee_Loan/android.view.ViewGroup (6)'), 0)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.closeApplication()

