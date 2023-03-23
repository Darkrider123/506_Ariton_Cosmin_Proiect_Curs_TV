public class Exam {
    public Integer grade(Boolean cheated, Integer points) {

        if (points < 0 || points > 100)
            throw new RuntimeException("Invalid points");

        if (cheated)
            return 1;

        if (points >= 95)
            return 10;

        if (points >= 85)
            return 9;

        if (points >= 75)
            return 8;

        if (points >= 65)
            return 7;

        if (points >= 55)
            return 6;

        if (points >= 45)
            return 5;

        if (points >= 35)
            return 4;

        if (points >= 25)
            return 3;

        if (points >= 15)
            return 2;

        return 1;
    }

}
