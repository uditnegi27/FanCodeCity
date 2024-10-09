# FanCodeCity



# fanCodeCity Assignment

## Project Description
This is an API automation project written in Java with Spring Boot, utilizing Rest Assured for API testing and Cucumber for behavior-driven development (BDD). The project aims to verify whether users from fanCode City have over 50% of their todo tasks completed.

## Tech Stack
- **Java** with **Spring Boot**
- **Rest Assured** with **Cucumber**
- **Build Tool**: Maven

## Prerequisites
Before running the project, ensure you have the following installed on your machine:
- **Java JDK** (version 21 or above)
- **Maven** (version 3.6 or above)

## Project Setup
To set up the project, follow these steps:
1. Clone the project repository:
   ```bash
   git clone https://github.com/uditnegi27/FanCodeCity.git
   
2. cd FanCodeCity
3. mvn clean test

Test Reports:
- Upon successful execution of the tests, the test report will be generated in the target folder with the name fanCode-report.html. You can open this file in a web browser to view the detailed results of your tests.

Features & Scenarios:
- The main feature of this project is to determine if users from fanCode City have over 50% of their todo tasks completed. The tests cover various scenarios related to user todo task completion.

Running in CI/CD:
- This project can be easily configured with CI/CD tools like Jenkins. You can execute the tests in your CI/CD pipeline using the following command:
    - mvn clean test
 
NOTE: You can now directly copy this text into your `README.md` file. If you need further adjustments, just let me know!







##################################################################################     INSTALL PREREQUISITIES    ##################################################################################

### Install Java JDK (version 11 or above)
1. **Download the Java JDK:**
   - Go to the [Oracle JDK download page](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or [AdoptOpenJDK](https://adoptopenjdk.net/).
   - Select the appropriate version for your operating system.

2. **Install the JDK:**
   - Follow the installation instructions specific to your operating system (Windows, macOS, or Linux).

3. **Set JAVA_HOME Environment Variable:**
   - **On Windows:**
     - Right-click on `This PC` or `Computer` and select `Properties`.
     - Click on `Advanced system settings` and then `Environment Variables`.
     - Under `System Variables`, click `New`, and add:
       - **Variable name:** `JAVA_HOME`
       - **Variable value:** Path to your JDK installation (e.g., `C:\Program Files\Java\jdk-11.x.x`).
     - Click `OK` to save.

   - **On macOS/Linux:**
     - Open a terminal and add the following line to your `~/.bash_profile`, `~/.bashrc`, or `~/.zshrc` file:
       ```bash
       export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-11.x.x.jdk/Contents/Home
       ```
     - Replace the path with your actual JDK installation path.
     - Run `source ~/.bash_profile` or `source ~/.bashrc` to apply changes.

4. **Verify Installation:**
   - Open a terminal or command prompt and run:
     ```bash
     java -version
     ```
   - You should see the installed version of Java.

### Install Maven (version 3.6 or above)
1. **Download Maven:**
   - Go to the [Maven download page](https://maven.apache.org/download.cgi).
   - Download the binary zip file for your operating system.

2. **Install Maven:**
   - **On Windows:**
     - Unzip the downloaded file to a directory (e.g., `C:\Program Files\Apache\maven-x.x.x`).
     - Add `bin` directory of Maven to the `PATH` environment variable:
       - Go to `System Properties` > `Environment Variables`.
       - Under `System Variables`, find and select `Path`, then click `Edit`.
       - Click `New`, and add the path to the Maven `bin` directory (e.g., `C:\Program Files\Apache\maven-x.x.x\bin`).
       - Click `OK` to save.

   - **On macOS/Linux:**
     - Unzip the downloaded file to a directory (e.g., `/opt/apache-maven-x.x.x`).
     - Add the following line to your `~/.bash_profile`, `~/.bashrc`, or `~/.zshrc` file:
       ```bash
       export M2_HOME=/opt/apache-maven-x.x.x
       export PATH=$M2_HOME/bin:$PATH
       ```
     - Replace the path with your actual Maven installation path.
     - Run `source ~/.bash_profile` or `source ~/.bashrc` to apply changes.

3. **Verify Installation:**
   - Open a terminal or command prompt and run:
     ```bash
     mvn -version
     ```
   - You should see the installed version of Maven.


