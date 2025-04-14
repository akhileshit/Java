package annotations03;

public class Demo { // Custom Annotations
	@AgeCheck(message = "Keep as per the adult", minvalue = 18)
	int age;
	
	@FullName
	String name;
	
	@PersonalMail
	String email1;
	
	@ProfessionalMail(format = "XYZ@ORG_NAME.COM")
	String email2;
}
