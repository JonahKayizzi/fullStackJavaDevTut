
public class Calculate {
	
	public static boolean isPrime (int x) {
		if (x < 2) return false;
		
		for (int i = 2; i <= x/2 ; i++) {
			if(x%i == 0) return false;
		}
		
		return true;
	}

}
