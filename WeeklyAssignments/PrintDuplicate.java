package WeeklyAssignments;

public class PrintDuplicate {

	public static void main(String[] args) {
		int[] a = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int[] b = a;
		int t=0;
		int count= a.length;
		for(int i=0; i < count; i++)
		{
			for (int j = 0; j < count; j++) {
				
				if(a[i] == b[j])
				{
					t=t+1;
				}
						
			}
			if (t>0) {
				t=0;
				System.out.println(a[i]);
				
			}
	}
	}

}
