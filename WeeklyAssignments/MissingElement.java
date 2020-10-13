package WeeklyAssignments;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr); //1,2,3,4,6,7,8
		for(int i=0; i < arr.length; i++)
		{
			if(i+1 != arr[i]) {
				System.out.println(i+1);
				break;
			}
				
		}
		
		
	}

}
