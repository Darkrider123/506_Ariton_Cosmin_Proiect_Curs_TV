public class PrimeFlawed {

    private final Integer two;

    public PrimeFlawed() {
        two = 2;
    }

    public Boolean isPrime(Integer number) {

        if (number < 0)
            throw new RuntimeException("Negative numbers not allowed");

        if (number == 0)
            return Boolean.FALSE;

        if (number == 1)
            return Boolean.FALSE;

        if (number == 2)
            return Boolean.TRUE;

        if (number % two != 0)
            return Boolean.FALSE;

        for (Integer i = 3 ; i < number ; i++, i++)
            if (number % i == 0)
                return Boolean.FALSE;

        return Boolean.TRUE;

    }

}
