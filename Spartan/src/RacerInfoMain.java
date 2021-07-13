
public class RacerInfoMain {
	public static void main(String[] args) {
		RaceInfo racer1 = new RaceInfo();
		racer1.setBibNbr(31335);
		racer1.setName("Joseph");
		racer1.setAge(24);
		racer1.setAddress("Fayetteville");
		racer1.setRaceType("Beast Mode");
		racer1.setStartTime(1015);
		racer1.setEndTime(1425);
		
		
		
		RaceInfo racer2 = new RaceInfo();
		racer2.setBibNbr(32335);
		racer2.setName("Sally");
		racer2.setAge(27);
		racer2.setAddress("Fayetteville");
		racer2.setRaceType("Super");
		racer2.setStartTime(1115);
		racer2.setEndTime(1225);
		
		System.out.println(racer1);
		System.out.println(racer2);
		
	}
}
