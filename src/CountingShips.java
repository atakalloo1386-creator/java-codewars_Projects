public class CountingShips {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;

        for (Boolean AllOfTheNumberOfFalseOrTrueSheeps : arrayOfSheeps) {
            if (AllOfTheNumberOfFalseOrTrueSheeps != null) {
                count += (AllOfTheNumberOfFalseOrTrueSheeps ? 1 : 0);
            }
        }

        return count;
    }
}


