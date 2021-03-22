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
		int ind;
		for (int id = 0; id < arrOfInt.size(); id++) {
			if (arrOfInt.get(id) == 5) {
				ind = id;
				System.out.println(ind);
			}	
		}
		
		
		//System.out.println(arrOfInt);
	}

}
