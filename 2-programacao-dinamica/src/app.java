import java.util.ArrayList;

public class app {

	public static void main(String[] args) {
	}

	public static long mochilabrec(ArrayList<Double> p, ArrayList<Double> u, int n, double m) {

		if (n == -1) {
			return 0;
		} else {
			long a = mochilabrec(p, u, n - 1, m);
			if (p.get(n) > m) {
				return a;
			} else {
				long b = (long) (u.get(n) + mochilabrec(p, u, n - 1, m - p.get(n)));
				return max(a, b);
			}
		}

	}

	public static long max(long a, long b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}

	}
}
