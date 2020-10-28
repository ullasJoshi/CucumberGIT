package stepDefinations;


import java.io.IOException;

import Automation.AutomateRSAcademy.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends Base{




	@Before
	public void preCondition() throws IOException{	

		getDriver();
	}

	@After

	public void postOperation(){



		driver.close();
	}

}
