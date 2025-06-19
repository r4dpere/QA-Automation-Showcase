import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')
WebUI.navigateToUrl('https://example.com/login')
WebUI.setText(findTestObject('Page_Login/input_Username'), 'demo')
WebUI.setEncryptedText(findTestObject('Page_Login/input_Password'), 'encrypted_password')
WebUI.click(findTestObject('Page_Login/button_Login'))

WebUI.verifyElementPresent(findTestObject('Page_Home/icon_User'), 10)
WebUI.closeBrowser()
