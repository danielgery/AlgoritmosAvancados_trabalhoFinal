import java.util.Random;

public class app {
	/**
	 * Alunos: Israel Deorce e Daniel Gery
	 */

	public static Random random = new Random();
	
	public static void main(String[] args) {
		//int[] a = { 1, 3, 5, 4, 8, 6, 9 };
		
		int[] a = new int[32];
		int[] b = new int[2048];
		int[] c = new int[1048576];
		
		preencheVet(a);
		preencheVet(b);
		preencheVet(c);
		
		mergeSort(a, 0, a.length - 1);
		printaVet(a);
		
		mergeSort(b, 0, b.length - 1);
		printaVet(b);
		
		mergeSort(c, 0, c.length - 1);
		printaVet(c);
	}
	
	public static void preencheVet(int[] vet) {
		for (int i = 0; i < vet.length; i++) {
			vet[i] = random.nextInt(100);
		}
	}
	
	public static void printaVet(int[] vet) {
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}

	public static int[] mergeSort(int arr[], int l, int r) {
		if (l == r) {
			return arr;
		}

		int m = l + (r - l) / 2;

		mergeSort(arr, l, m);
		mergeSort(arr, m + 1, r);

		merge(arr, l, m, r);

		return arr;

	}

	public static void merge(int arr[], int l, int m, int r) {
		int i, j, k;
		int n1 = m - l + 1;
		int n2 = r - m;

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (i = 0; i < n1; i++)
			L[i] = arr[l + i];
		for (j = 0; j < n2; j++)
			R[j] = arr[m + 1 + j];

		i = 0; 
		j = 0; 
		k = l; 
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}