public class Prime {

    private final Integer two;

    public Prime() {
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

        if (number % two == 0)
            return Boolean.FALSE;

        Integer i = 3;
        for (i = 3 ; i < Math.sqrt(number) ; i++, i++)
            if (number % i == 0)
                return Boolean.FALSE;

        return Boolean.TRUE;

    }

}
