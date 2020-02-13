package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileUtil {
	public static String getValueForKey(String Key) throws Exception{
	
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/Environment.properties");
	Properties p=new Properties();
	p.load(fis);
	
	 return p.getProperty(Key);
	
	

}
}
