package Test_Runner;



	import org.junit.runner.RunWith;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	
	@CucumberOptions(features="src/test/resources/Features",
	                          //here we provide the path of feature file
	
	glue= {"Step_Defination"}, //glue code means all the code belong to stepdefination //here we have to provide the package name of that stepdefination file
	monochrome=true,
	//In glue code mention the extact name of your package name.
			//plugin is used to genrate report
	plugin={"pretty","junit:target/JunitReport/report.xml"
			
			,"html:target/HtmlReports"
			
			,"json:target/JSONReports/report/json",
			
			//for extendreport we have added this
			"tech.grasshopper.extentreports-cucumber6-adapter:"})//jar particular file run karych asel tr }natr ek comma ani tags la close brakets dych ahe
	//tags="@smoketest") //if we want to run specific file then we use tagname of that file
	//if we run more tags then only give comma and name of that tag
	
	
	public class TestRunner {
     //used for grouping
		//test runner is Junit Class we can run only with help of junit 
		
	}

