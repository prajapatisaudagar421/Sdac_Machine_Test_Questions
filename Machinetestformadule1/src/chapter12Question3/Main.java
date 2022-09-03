package chapter12Question3;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Main {
public static void main(String[] args) {
	Properties properties = new Properties();
	Set username;
	String str;
	properties.put("tom", "first");
	properties.put("jerry", "second");
	properties.put("anish", "anishk");
	properties.put("siddant", "s786");
	properties.put("atul", "r100");
	username = properties.keySet();
	Iterator iterator = username.iterator();
	while (iterator.hasNext()) {
		str = (String) iterator.next();
		System.out.println("the user name is "+ str+"password is "+properties.getProperty(str));
		
	}
	str = properties.getProperty("ram","not found");
	System.out.println("the user name is tom and password is " + str);
	
	
}
}
