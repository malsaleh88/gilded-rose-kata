# Gilded Rose
This is a Java implementation of the Gilded Rose code.

# Introduction
This project helps manage items in a store. It keeps an eye on their quality and how long they can be sold.

# Requirements
To run this project, you need the following:

* Java - The Java Development Kit (JDK)
* Gradle - A build tool for Java projects


# Running the Application
To run the application, follow these steps:

* Clone this repository to your local machine:

git clone https://github.com/your-username/gilded-rose-java.git

* Open your terminal and navigate to the project directory:

./gradlew -q text

# Running Tests
To run the project's unit tests:

Open a terminal and navigate to the project directory.

* Use the following command to run the tests:
./gradlew test

* To specify the number of days for the tests, you can use the following command (replace 10 with the desired number of days):
./gradlew -q text --args 10

# Running Tests in IntelliJ IDEA
If you prefer to use IntelliJ IDEA for running tests, follow these steps:

* Open IntelliJ IDEA.
* Locate the GildedRoseTest class (it contains the unit tests).
* To run all tests in the class, right-click on the GildedRoseTest class name and choose "Run 'GildedRoseTest'."
* To run a specific test method, open the GildedRoseTest class, locate the test method, right-click on it, and choose "Run 'YourTestMethodName'."
* View the test results in the "Run" panel at the bottom of the IntelliJ IDEA window. It will indicate which tests passed and which ones failed.

