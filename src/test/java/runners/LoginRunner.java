package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) //here when we hover over it on @RunWith we should select add Junit add library build path
@CucumberOptions(
//		features = "src\\test\\java\\features\\TechFiosLogin.feature",  //here we copy the feature link
		features = "classpath:features", // if we have more features, this is the formula and it's the easy way
		glue = "steps", //glue means wich package you have stepDefination class
		tags = "@DbScenario1", //here we specify the scenario that we want to run from TechFiosLogin.featur 
		monochrome = true,  //and we keep it true always
		dryRun = false, //it check for compilation it's not important we can commit it or keep it fals
		plugin = {  //plugin means what type of report you want to make
				"pretty",
				"html:target/cucumber",  //here we gonna create html report and save it in target folder and name it cucumber
				"json:target/cucumber.json"
		}
		//Above is the shortcut for writing LoginStepDefination, when you run it bring all in console
		
		)
public class LoginRunner {// in run class we write our code above the class

}
