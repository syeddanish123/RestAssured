set projectLocation=C:\Eclipse\WORKSPACE\My_Framework

cd %projectLocation%

set classpath=%projectLocation%\bin;%projectLocation%\lib\*

java org.testng.TestNG %projectLocation%\testng.xml