package week3assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintduplicateArray {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		Set<Integer> values = new LinkedHashSet<Integer>();

		for (Integer result : arr) {  


			if ((values.add(result) == false)) {

				System.out.println("Duplicate values are: " + result);
			}
		}
	}
}





