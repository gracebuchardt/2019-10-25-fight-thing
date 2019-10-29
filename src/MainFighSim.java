import java.util.Scanner;

public class MainFighSim {

	public static void main(String[] args) {

		//Using as practice for loops, randoms, variables and planning ahead of time with coding


		//Intro part
		//Include rules and such

		
		//random numbers
		//Random rnd.nextInt(10);
		//10 means that the random number will e from 0-9
		
		//to pick a random from min-max
		//rnd.nextInt(max-min+1)+min
		// it is like (9-1+1) +1
		
		
		
		//loop

		int EnemyHealth = 400;

		int PlayerHealth = 600; 

		String PlayerAttack = null;
System.out.println("Fight Sim (for loop reference reasons...)");

		while (EnemyHealth>0) {
			System.out.println("Current Enemy Health");
			System.out.println(EnemyHealth);

			//When attacks are done, it should deplete enemy health accordingly

			Scanner in=new Scanner(System.in);
			
			PlayerAttack = in.nextLine();
			

			if (PlayerAttack.equalsIgnoreCase("no u")) {
				EnemyHealth = EnemyHealth - 200;
				System.out.println("Woah!!");
			}

			else if (PlayerAttack.equalsIgnoreCase("sword")) {
				EnemyHealth = EnemyHealth - 75;
				System.out.println("woooOsh.");
			}

			else if (PlayerAttack.equalsIgnoreCase("not use an indoor voice")){
				EnemyHealth = EnemyHealth - 50;
				System.out.println("[insert sound effect]");
				
				
				//Trying to make enemy attack back every turn, but with a random number of damage betwee 200-40.
				
				//else 
				//PlayerHealth = PlayerHealth - (rnd.nextInt(200-40)-40);
			}
		}
		

		System.out.println("Enemy defeated!");
		System.out.println("You win...");
		System.out.println("Nothing.");
		
		}
	}
	

	

