import java.util.ArrayList;

public class app {

	public static void main(String[] args) {
	}

	public static long mochilabrec(
			ArrayList<Double> p, //pesos
			ArrayList<Double> u, //utilidades
			int n, 
			double m //mochila
			) {

		if (n == -1)
			return 0;

		long a = mochilabrec(p, u, n - 1, m);
		
		if (p.get(n) > m)
			return a;

		long b = (long) (u.get(n) + mochilabrec(p, u, n - 1, m - p.get(n)));
		return max(a, b);

	}

	public static long max(long a, long b) {
		return a > b ? a : b;
	}

}
