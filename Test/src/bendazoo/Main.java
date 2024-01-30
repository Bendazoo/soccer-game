package bendazoo;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("What is your name: ");
		String UserName = scanner.nextLine();
		
		System.out.println("What is your age: ");
		int UserAge = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("What is your nationality: ");
		String UserNationality = scanner.nextLine();
		
		Soccer player = new Soccer(UserName, UserAge, UserNationality);
		
		System.out.println("Choose type \"roll\" to roll dice: ");
		
		
		int end = 1;
		
		while(end == 1) {
			
			String confirm = scanner.nextLine();
			if(confirm.contains("roll") == true) {
				int choice = random.nextInt(6)+1;;		
				
				switch(choice) {
				
				case 1: player.goal();
				break;
				
				case 2: player.missed();
				break;
				
				case 3: player.penalty();
				break;
				
				case 4: player.injured();end = 0; player.stats();
				break;
				
				case 5: player.redcard();end = 0; player.stats();
				break;
				
				case 6: player.game_ended(); end = 0; player.stats();
				break;
			
				}
			
		} else {
			
			System.out.println("Please type \"roll\" to play: ");
		}	
		
		}
		
	}
}





