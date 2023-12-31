# Testing SauceDemo webpage functionality 

## Table of content

<h4> <ol>
  <li><a href="#About this project">About this project</a></li>
  <li><a href="#Prerequisites">Prerequisites</a></li>
  <li><a href="#Installation">Installation</a></li>
  <li><a href="#Architecture">Architecture</a></li>
  <li><a href="#Contact">Contact</a></li>
</ol> </h4>

## <a id ="About this project"></a>About this project

<img src="SauceDemo.png">

* In this project are presented automated tests to check SauceDemo website functionality. 
* Testing environment can be found <a href="https://www.saucedemo.com/">here</a>. 
* The code is written in Java language, using Selenium and Maven.
* Cucumber is used to provide more understanding on how the code works.

## <a id = "Prerequisites"></a>Prerequisites

In order to utilise this project you need to have the following installed locally:

* Maven:
<br>On Windows install <a href="https://chocolatey.org/install">Chocolatey</a> and use the following command:
  ```sh
  choco install maven
  ```
  On MacOS install <a href="https://brew.sh/">HomeBrew</a> and use the following command:
  ```sh
  brew install maven
  ```
* JDK (can be installed via <a href="https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/downloads-list.html">Amazon Corretto</a>)
* Chrome browser
* <a href="https://git-scm.com/downloads">Git</a>

## <a id = "Installation"></a>Installation

To reproduce this project repeat the following steps:

* Clone the repository:
```sh
git clone mrudnyk/selenium-project
```
* Run all the tests by typing in terminal:
```sh
mvn test
```

## <a id = "Architecture"></a>Architecture
Framework is divided in such subsections:
* src/main/java/lv/acodemy/hooks - @After annotation that provides actions after each test
* src/main/java/lv/acodemy/runner - Cucumber runner for test execution
* src/main/java/lv/acodemy/sauce_pages - Objects and methods of specific pages of website
* src/main/java/lv/acodemy/step_definitions - Step definitions
* src/main/java/lv/acodemy/utils - Test data and properties utils
* src/test/java - File with test suite
* src/test/resources - File with test feature written in Gherkin language

## <a id = "Contact"></a>Contact
* Project link: <a href="https://github.com/mrudnyk/selenium-project">https://github.com/mrudnyk/selenium-project </a>
* Linkedin: <a href="https://www.linkedin.com/in/mariia-rudnyk-b86624287/">https://www.linkedin.com/in/mariia-rudnyk-b86624287/ </a>
* Personal email: <a href="mailto: mariia.rudnyk@outlook.com"> mariia.rudnyk@outlook.com </a>










