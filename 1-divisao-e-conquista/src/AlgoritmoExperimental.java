
public class AlgoritmoExperimental {

	public static void main(String[] args) {
		System.out.println(maxVal2(new int[] {0, 1, 3, 3, 4, 5}, 0, 5));

	}
	
	public static int maxVal2(int A[], int init, int end) { 

	    if (end - init <= 1)

	        return max(A[init], A[end]); 

	   else {

	        int m = (init + end)/2;

	        int v1 = maxVal2(A,init,m); 

	        int v2 = maxVal2(A,m+1,end); 

	        return max(v1,v2);

	         }

	}
	
	private static int max(int v1, int v2) {
		return (v1 > v2) ? v1 : v2;
	}

}
