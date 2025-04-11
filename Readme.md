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

