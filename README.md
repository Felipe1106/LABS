For this code you first have to download Junit so that we can properly run the tests, so you will have to paste this link in the terminal wget https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar and wget https://repo1.maven.org/maven2/org/hamcrest/hamcrestcore/1.3/hamcrest-core-1.3.jar
You also want to create a .class file for all of the .Java files
lastly we are going to use this command to run the tests java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore HybridTests
