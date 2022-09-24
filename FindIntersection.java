package week3assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {

		int[] Array1= {3,2,11,4,6,7};
		int[] Array2= {1,2,8,4,9,7};

		List ListV1= new ArrayList();
		List ListV2= new ArrayList();

		for (Integer integer : Array1) {
			ListV1.add(integer);

		}
		for (Integer integer : Array2) {
			ListV2.add(integer);

		}

		/*SetV1.retainAll(SetV2);
		System.out.println(SetV1);
		 */ //it will show all the intersection value
		for(int i=0;i<=ListV1.size()-1;i++) {
			for(int j=0;j<=ListV2.size()-1;j++) {
				if(ListV1.get(i)==ListV2.get(j)) {
					System.out.println("Printing first array matches :" +ListV1.get(i));
					return ;
				}
			}



		}




	}

}
