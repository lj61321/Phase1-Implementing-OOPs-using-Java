//Inheritance Example

public class RaceInfo extends Racer {
	private int bibNbr;
	private String raceType;
	private int startTime;
	private int endTime;
	public int getBibNbr() {
		return bibNbr;
	}
	public void setBibNbr(int bibNbr) {
		this.bibNbr = bibNbr;
	}
	public String getRaceType() {
		return raceType;
	}
	public void setRaceType(String raceType) {
		this.raceType = raceType;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "RaceInfo [bibNbr=" + bibNbr + ", raceType=" + raceType + ", startTime=" + startTime + ", endTime="
				+ endTime + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress()
				+ "]";
	}
	
	
	
	
	
	
	
	
}
