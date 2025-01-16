public boolean isSuccessMessageDisplayed() {
    return driver.findElement(By.id("successMessage")).isDisplayed();
}