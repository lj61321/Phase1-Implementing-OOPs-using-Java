//program demonstrates the use of the setter method
//to modify an existing object
//also, programs make use of encapsulation - one of the four pillars of object oriented programming

public class SpartanMain {

	public static void main(String[] args) {

		Spartan spartan1 = new Spartan(13033,"Johnny","Sprint",1045,1445);
		
		System.out.println(spartan1);
		
		//overwrite specific fields
		spartan1.setTypeRace("Super");
		spartan1.setFinishTime(1600);
		
		System.out.println(spartan1);
	}

}
