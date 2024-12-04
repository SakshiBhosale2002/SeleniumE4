package Basic;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;

public class ReadFromXmlWithBase extends DwsBaseClass 
{
	@Parameters({"browser","url"})
	@Test
	public void Launch(String browser,String url)
	{
		System.out.println("Welcome into dws.....");
		
	}

}
