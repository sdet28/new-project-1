package project_name;

import org.testng.annotations.Test;

public class CreateContactTest {
	@Test (groups ="smokeTest")
	public void createContactTest()
	{
		System.out.println("contact created");
	}
	
	@Test (groups ="smokeTest")
	public void modifyContactTest()
	{
		System.out.println("modify contact");
	}
}
