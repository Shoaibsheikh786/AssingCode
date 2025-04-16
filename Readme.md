<<<<<<< HEAD
# 🚀 Automation Testing Framework

This is a Selenium-based Automation Testing Framework built with Java and TestNG.  
We followed the **Page Object Model (POM)** design pattern to maintain clean and reusable code.  

---

## 🛠️ Tools & Technologies Used

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Allure Reports** (for test reporting)
- **Maven** (for build management)
- **Headless browser execution support**

---

## 📂 Project Structure

├── src │ ├── main │ │ └── java # Page Objects, Utilities │ └── test │ └── java # Test classes ├── regression.xml # TestNG suite file ├── pom.xml # Maven configuration └── allure-results/ # Allure test result files


---

## 🧪 How to Run the Tests

### 💻 Clone the Repo


git clone  url
cd Swag_Labs
🧼 Clean & Install Dependencies

mvn clean install
▶️ Run the Tests

mvn clean test -DsuiteXmlFile=regression.xml
🕶️ Run in Headless Mode (No UI)

mvn clean test -Dheadless=true -DsuiteXmlFile=regression.xml
✅ Note: Headless mode runs tests without opening the browser window — useful for CI/CD pipelines.

📊 Test Reporting with Allure
We used Allure Reports for test reporting. After running tests:

Results will be generated in the allure-results/ folder.

To view the report, run:
allure serve allure-results

📐 Design Pattern
We implemented Page Object Model (POM):
Each web page is represented by a corresponding Java class containing all web elements and methods for interaction.

=======
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
>>>>>>> 6506c6c12eb69e5766b7d143c31822d2907f001c
