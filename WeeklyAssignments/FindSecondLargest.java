package WeeklyAssignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data); //2,3,4,6,7,11
		int count = (data.length)-2;
		System.out.println(data[count]);
		

	}

}
