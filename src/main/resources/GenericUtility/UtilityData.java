import java.io.FileInputStream;
import java.util.Properties;

public class PropertyUtility {
	/**
	* This method will read all the data from propertyfile and retuen the
	data value to caller
	* @param key
	* @return
	* @throws IOException
	* @author gpmanohar
	*/
}
	
	public String readDataFromPropertyFileString(String key) {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\UserLogin.txt");
		Properties pro = new Properties();
		pro.load(fis);
		String Val = pro.getProperty(key);
		return Val;
		
		
	}

}
