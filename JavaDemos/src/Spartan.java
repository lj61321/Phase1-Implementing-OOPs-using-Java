
public class Spartan {
	private int bibNo;
	private String racerName;
	private String typeRace;
	private int startTime; //use int until I learn more about using date/time
	private int finishTime;
	
	//generate constructor
	//right click source --> select Generate constructor using fields
	//public Spartan() {
		// not needed for now super();
		/*this.bibNo = bibNo;
		 * this.racerName = racerName;
		 *this.typeRace = typeRace;
		 *this.startTime = startTime;
		 *this.finishTime = finishTime;
		*/
		
		
	//}
	
	
	public Spartan(int bibNo, String racerName, String typeRace, int startTime, int finishTime) {
		
		this.bibNo = bibNo;
		this.racerName = racerName;
		this.typeRace = typeRace;
		this.startTime = startTime;
		this.finishTime = finishTime;
	}


	//generate setters and getter using right click
	//and selecting source ...
	
	public int getBibNo() {
		return bibNo;
	}

	public void setBibNo(int bibNo) {
		this.bibNo = bibNo;
	}

	public String getRacerName() {
		return racerName;
	}

	public void setRacerName(String racerName) {
		this.racerName = racerName;
	}

	public String getTypeRace() {
		return typeRace;
	}

	public void setTypeRace(String typeRace) {
		this.typeRace = typeRace;
	}

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(int finishTime) {
		this.finishTime = finishTime;
	}
	
	//generate toString() method
	@Override
	public String toString() {
		return "Spartan [bibNo=" + bibNo + ", racerName=" + racerName + ", typeRace=" + typeRace + ", startTime="
				+ startTime + ", finishTime=" + finishTime + "]";
	}
	
	
	
}
