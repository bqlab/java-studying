package week7;

public class Utils {
	public int findMax(Compare o, int b, int e) {
		int maxIdx = b;
		for(int i=b+1; i<=e; i++) {
			if(o.isGreater(maxIdx, i))
				maxIdx = i;
		}
	}
}
