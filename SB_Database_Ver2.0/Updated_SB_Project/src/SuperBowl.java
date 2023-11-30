import java.io.FileNotFoundException;

public class SuperBowl 
{
	// variables for parts of the super bowl information
	private String SBRomanNum;
	private String[] teams = new String[2];
	private int[] score = new int[2];
	private String winner;
	private String MVP;
	private int year;
	private String location;
	
	// txt file where data comes from
	private final static String SBInfo = "superbowl-information.txt";
	
	
	// class constructor
	public SuperBowl() 
	{
		
	}
	
	// specified class constructor
	public SuperBowl(String SBNum) throws FileNotFoundException
	{
		String[][] SuperbowlInfo = FileInput.buildDataMatrix(SBInfo);
		int sbnum = roman_to_int.convertToInt(SBRomanNum);
		
		this.SBRomanNum = SuperbowlInfo[sbnum][0];
		
		this.teams = SuperbowlInfo[sbnum][1].trim().split(" vs. ");
		
		this.score[0] = Integer.valueOf(SuperbowlInfo[sbnum][2].trim().split("-")[0]);
		this.score[1] = Integer.valueOf(SuperbowlInfo[sbnum][2].trim().split("-")[1]);
		
		this.winner = SuperbowlInfo[sbnum][3];
		
		this.MVP = SuperbowlInfo[sbnum][4];
		
		this.year = Integer.valueOf(SuperbowlInfo[sbnum][5]);
		
		this.location = SuperbowlInfo[sbnum][6];
		
	}
	
	
}
