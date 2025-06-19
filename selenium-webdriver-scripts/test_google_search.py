from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

driver = webdriver.Chrome()
driver.get("https://www.google.com")

search_box = driver.find_element(By.NAME, "q")
search_box.send_keys("AI Vibe Coding with Ringo")
search_box.send_keys(Keys.RETURN)

time.sleep(2)
results = driver.find_elements(By.CSS_SELECTOR, 'div.g')
assert len(results) > 0, "No results found."

print("Test Passed: Search results are displayed.")
driver.quit()
