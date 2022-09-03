package chapter10;

public class Main {
public static void main(String[] args) {
	String name = "saudagar";
	System.out.println(name.length());
	String name1 = "saudagarprajapati";
	System.out.println(name.compareTo(name));
	String sirname = "prajapati";
	System.out.println(name.concat(sirname));
	String fullname = name.concat(name1);
	System.out.println(fullname);
	String info = " hello how are you ";
	info.trim();
	System.out.println(info+"saudagar");
	System.out.println(info.trim()+"SAUDAGAR");
	String s1 =" hello ";
	System.out.println(s1+"how are you");
	System.out.println(s1.trim()+"how are you");
	System.out.println(info.trim());
	
	System.out.println(info.replace("are", "is"));
	int i = 20;
	String s = String.valueOf(i);
	System.out.println(s+27);
	int z = 20;
	Integer a = z;
	System.out.println(a);
	Integer b = 21;
	int p = b;
	System.out.println(p);
	
	
	
}
}
