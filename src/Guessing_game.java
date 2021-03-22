import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Guessing_game {

	public static void main(String[] args) {
		ArrayList<Integer> arrOfInt = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arrOfInt.add(i+1);
		}
		System.out.println(arrOfInt);
		Collections.shuffle(arrOfInt);
		int ind = -1;
		for (int id = 0; id < arrOfInt.size(); id++) {
			if (arrOfInt.get(id) == 5) {
				ind = id;
				//System.out.println(ind);
			}	
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Where is the index of number 5 from 0 - 9?");
		int y;
		for (int x =  0; x < 3; x++) {
			System.out.print("It's: ");
			y = sc.nextInt(10);
			if (y == ind) {
				System.out.println("You got a prize!");
				break;
			}else
				System.out.println("Its not correct, please try again");
		}
		
		System.out.println("Here is the shuffled ArrayList!\n"+arrOfInt);
	}

}
