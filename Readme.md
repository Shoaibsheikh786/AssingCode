# 🔍 Selenium Automation Framework

This is a **Test Automation Framework** built using **Selenium WebDriver**, **Java**, and **TestNG**. It follows best practices in design and is capable of executing tests in **headless** and **UI mode**, depending on your system configuration.

---

## 🚀 Tech Stack

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Maven**
- **Allure Reports**
- **Headless Browser Execution**

---

## 📁 Getting Started

### 1. 📦 Clone the repository
```bash
git clone https://
cd Swag_Labs
2. 📥 Install dependencies and build the project
Java 11 +

mvn clean install
3. ▶️ Run Tests
Normal UI Execution:

mvn clean test
🧠 Headless Execution:
mvn clean test -Dheadless=true
Headless execution runs the browser in the background without launching the UI — useful for CI/CD or low-resource environments.

📊 Reporting - Allure Reports
After test execution, Allure results will be generated under the allure-results/.

To Generate the HTML Report:

allure serve allure-results
This will automatically open the Allure report in your default browser.

🧪 Structure
src/test/java – Test cases and test logic

src/main/java – Core framework code (Page Objects, Utilities, etc.)

Regression.xml – TestNG suite configuration

allure-results/ – Output folder for Allure raw test results

📌 Notes
Pass headless parameters via system properties:

mvn clean test  -Dheadless=true
