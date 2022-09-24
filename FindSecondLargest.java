package week3assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};

		List <Integer> Intnum = new ArrayList<Integer>();
		for (Integer integer : data) {
			Intnum.add(integer);	

		}
		Collections.sort(Intnum);
		System.out.println(Intnum);
		System.out.println("2nd element in ascending :"+Intnum.get(1));


	}

}
