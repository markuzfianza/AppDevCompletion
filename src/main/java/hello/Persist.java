class Persist {
	public static int persistence(long n) {
      int pCount = 0;
    while (n > 9) {
      long prod = 1;
      while (n > 0) {
        prod *= n % 10;
        n /= 10;
      }
      n = prod;
      pCount++;
    }
		return pCount; 
	}
}
