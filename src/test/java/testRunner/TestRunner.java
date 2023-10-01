package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//features= {".//Features//login.feature"},
		//features= {".//Features//LoginDDT.feature"},
		features= {".//Features//LoginDDTExcel.feature"},
		//features= {".//Features//login.feature",".//Features//LoginDDT.feature"},
		//features= "@target/rerun.txt",  //runs only failures
		glue="stepDefinitions",
		plugin= {
				
				"pretty", "html:reports/myreport.html",
				"json:reports/myreport.json",
				"rerun:target/rerun.txt", //runs only failures
	        	},     //Mandatory to capture failures
		
		dryRun=false,
		monochrome=true
	  //tags= "@sanity"                        //scenarios tagged with @sanity
	  //tags= "@regression"                    //scenarios tagged with @regression
	  //tags= "@sanity and @regression"        //scenarios tagged with both @sanity and @regression
      //tags= "@sanity or @regression"         //scenarios tagged with either @sanity or @regression
	  //tags= "@sanity and not @regression"    //scenarios tagged with @sanity but not tagged with @regression
	
		)

public class TestRunner 
{

}
