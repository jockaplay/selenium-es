from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()
driver.get("https://www.google.com")
assert "Google" in driver.title
elem = driver.find_element(By.NAME, "q")
elem.clear()
elem.send_keys("youtube")
elem.send_keys(Keys.RETURN)
assert "No results found." not in driver.page_source