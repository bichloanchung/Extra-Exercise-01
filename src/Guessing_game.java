import java.util.ArrayList;
import java.util.Collections;

public class Guessing_game {

	public static void main(String[] args) {
		ArrayList<Integer> arrOfInt = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arrOfInt.add(i+1);
		}
		System.out.println(arrOfInt);
		Collections.shuffle(arrOfInt);
		System.out.println(arrOfInt);
	}

}
