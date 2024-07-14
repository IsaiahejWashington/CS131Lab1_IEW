import java.util.Random;
public class NonPlayerCharacter extends GameCharacter {
	
	private boolean active;
	private String intelligenceType;
	public String reportStructure;
	public String introduce;
	public String exclaim;
	public String id;
	
	public NonPlayerCharacter() {
		Random String = new Random ();
		String [] exclaim={"Dag Gummit","Doggone it","Holy Cow","Jeez","Well Cheese and Crackers"};
		
		//this.id = r.nextInt(1000) + 1;
		
		this.intelligenceType = "AVERAGE";
		this.introduce = "";
		this.active = false;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getIntelligenceType() {
		return intelligenceType;
	}

	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}

	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
		this.id=id;
		this.personality=personality;
		this.intelligenceType=intelligenceType;
		this.active=active;
	}

	public String getReportStructure() {
		return reportStructure;
	}

	public void setReportStructure(String reportStructure) {
		this.reportStructure = reportStructure;
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getExclaim() {
		
		return exclaim;
	}

	public void setExclaim(String exclaim) {
		this.exclaim = exclaim;
	}

	@Override
	public String toString() {
		return "NonPlayerCharacter [introduce=" + introduce + "Hello my name is ";
	}
	
	
	
	

	
}
