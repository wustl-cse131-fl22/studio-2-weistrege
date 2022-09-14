package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What is startAmount");
		double startAmount = in.nextDouble();
		System.out.println(Math.round(startAmount*100.0)/100.0);
		
		System.out.print("What is the winChance");
		double winChance = in.nextDouble();
		System.out.println(winChance);		
		
		System.out.print("What is winLimit");
		double winLimit = in.nextDouble();
		System.out.println(winLimit);
		
		System.out.print("What is totalSimulation");
		double totalSimulation = in.nextDouble();
		System.out.println(totalSimulation);
		
		int countWin = 0;
		int countLose = 0;

		for(int simulation = 1; simulation < totalSimulation+1; simulation++)
		{
			int count = 1;
			double money = startAmount;
			while(money > 0 && money < winLimit)
			{
				boolean win = Math.random()<winChance;
				if (win)
				{
					money++;
				}
				else {
					money--;
				}
				count = count + 1;
			}
			if (money==0)
			{
				countLose++;
				System.out.println("Simulation  " +simulation + " " +count + " LOSE");
				
			}
			else
			{	countWin++;
				System.out.println("Simulation  " + simulation +" " +count + "  WIN");
				
			}
		}
		System.out.println("loss: " + countLose+ "Simulation: "+ totalSimulation);
		System.out.println("Ruin Rate for Simulation: " + countLose/totalSimulation);
			
	}

}
