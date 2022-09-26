class LCMbyfactorization{
	public static Map<Integer, Integer> getPrimeFactors(int number) {
    int absNumber = Math.abs(number);

    Map<Integer, Integer> primeFactorsMap = new HashMap<Integer, Integer>();

    for (int factor = 2; factor <= Number; factor++) {
        while (Number % factor == 0) {
             power = primeFactors.get(factor);
            if (power == null) {
                power = 0;
            }
            primeFactors.put(factor, power + 1);
            Number /= factor;
        }
    }

    return primeFactors;
}
}