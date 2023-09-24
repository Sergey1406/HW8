public class ArrayValueCalculator {

    public static int doCalc(String[][] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4 || arr[i].length != 4) throw new ArraySizeException("Не вирній розмір массиву");
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Не вірні дані" + " " + i + " - " + j);
                }
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        try {
            int total = doCalc(new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}});
            System.out.println(total);
        } catch (ArraySizeException | ArrayDataException m) {
            System.out.println(m.getMessage());
        }


        try {
            int total = doCalc(new String[][]{{"A", "4", "9", "2"}, {"6", "1", "3", "7"}});
            System.out.println(total);
        } catch (ArraySizeException |
                 ArrayDataException m) {
            System.out.println(m.getMessage());
        }

        try {
            int total = doCalc(new String[][]{{"4", "8", "11", "133"}, {"B", "5", "4", "1"}, {"22", "553", "665", "55"}, {"546", "32", "44", "55"}});
            System.out.println(total);
        } catch (ArraySizeException | ArrayDataException m) {
            System.out.println(m.getMessage());
        }
    }
}
