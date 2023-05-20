package classPractice;

import java.util.ArrayList;

public class FibNumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> res = new ArrayList<>();
		res.add(1);
		res.add(1);

		for (int i = 0; i < 10; i++) {
			int temp = res.get(i) + res.get(i + 1);
			res.add(temp);
		}
		
		
		
	}

}
