package nfl;

import java.util.Scanner;

public class Giants {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Quaterback touchdowns:");
		int td = input.nextInt();
		System.out.println("Enter Total Yards");
		float ty = input.nextFloat();
		System.out.println("Enter Interceptions:");
		int Int = input.nextInt();
		System.out.println("Enter Completions:");
		int comp = input.nextInt();
		System.out.println("Enter Passes Attempted:");
		int att = input.nextInt();
		
		double PasserRating = calculatePasserRate(td,ty,Int,comp,att);
		System.out.println("Passer Rating is " + PasserRating);
	}
	

	public static double calculatePasserRate(int td, float ty, int Int, int comp, int att){
		double a = ((comp/att)-0.3)*5;
		double b = ((ty/att)-3)*.25;
		double c = ((td/att)-3)*20;
		double d = 2.375-(Int/att)*25;
		double PasserRating = ((a+b+c+d)/6)*100;
		return (double) (PasserRating);

			
	}
}