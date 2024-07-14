
public class BasketballTeam {
	
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	private String teamName;
	private String teamMascot;
	private String headCoach;
	
	public BasketballTeam() {
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
		
	}
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		this.teamName = teamName;
		this.teamMascot = teamMascot;
		this.headCoach = headCoach;
		
	}
	
	public double fieldGoalPercentage() {
		return fieldGoals/fieldGoalsAttempted;
	}
		//return result = fieldGoals/fieldGoalsAttempted;
		
	
	
	public double freeThrowPercentage() {
		return freeThrows/freeThrowsAttempted;
	}
	
	private double getWinPercentage() {
		return 0;
	}
	
	public double[] getStats() {
	double[] stats = {getWinPercentage(), fieldGoalPercentage(), freeThrowPercentage()};
	return stats;
	}//end getStats

	
		
	
	
	//public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted, double winPercentage) {
		//return winPercentage = wins/losses;
		
	//}
}
