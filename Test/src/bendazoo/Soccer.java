package bendazoo;
import java.util.*;


public class Soccer {
	
	String name;
	int age;
	String nationality;
	int goals = 0;
	Random random = new Random();
	
	
	
	Soccer(String name, int age, String nationality){
		
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		
	}
	
	void goal() {
		
		System.out.printf("%s has scored for %s.\n", this.name, this.nationality);
		goals += 1;
	}
	
	void missed() {
		
		System.out.printf("%s has missed for an opportunity for a goal.\n", this.name);
		
	}
	
	void penalty() {
		System.out.printf("A penalty given for %s, will he score it?\n", this.name);
		int randint = random.nextInt(6) +1;
		if (randint >=4) {
			System.out.println("\nHe has scored!!!\n");
			goals += 1;
			
		} else {
			
			System.out.println("\nHe has missed the penality!!!\n");
		}
		
		
	}
	
	void injured() {
		
		System.out.printf("%s seems to have suffered a debilating injury, he might be out of the game\n", this.name);
		
		
	}

		
	void redcard() {
		
		System.out.printf("A bad foul from %s gets him sent off the field!\n", this.name);
		
		
	}
	
	void game_ended() {
		
		System.out.println("The game has ended.\n");
	}
	
	void stats() {
		
		System.out.printf("The %d year old star from %s, scored %d goals for %s\n", this.age, this.nationality, this.goals, this.nationality);
	}
	
	
	

}
