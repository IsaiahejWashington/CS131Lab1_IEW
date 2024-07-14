
public abstract class SportsTeam {
	
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;
	
	public SportsTeam() {
		
		this.teamName = "";
		this.teamMascot = "";
		this.headCoach = "";
		this.wins=0;
		this.losses=0;
		
		}
	
	public SportsTeam(String teamName, String teamMascot, String headCoach, int wins, int losses) {
		this.teamName = teamName;
		this.teamMascot = teamMascot;
		this.headCoach = headCoach;
		this.wins = 0;
		this.losses = 0;
		
	}
	
	public double getWinPercentage() {
		return wins/losses;
		
	}
	
	//public double getStats() {
		//return losses;
		
	//}
		
		
		

	

}//end main
