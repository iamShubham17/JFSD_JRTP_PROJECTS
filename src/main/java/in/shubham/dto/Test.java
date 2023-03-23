package in.shubham.dto;

public class Test {
public static void main(String[] args) {
	
	Person p = new Person();
	
	p.setPersonid(101);
	p.setPersonName("Raghu");
	p.setGender("Male");
	
	
	System.out.println(p.getPersonid());
	System.out.println(p);
	
	
}
}
