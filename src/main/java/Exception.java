public class Exception {
    public static void main(String[] args) {
        String[][] arr = new String[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[0].length; x++) {
                arr[i][x] = "3";
            }
        }
        try {
            System.out.println(sumArr(arr));
        } catch (MySizeArrayException e) {
            System.out.println("Invalid size");
        } catch (MyArrayDataException e) {
            System.out.println("invalid format");
        }
    }

    public static int sumArr(String[][] arr) {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MySizeArrayException();
        }
        int sum = 0;
        int value;
        for (int i = 0; i < arr.length; i++) {
            for (int x = 0; x < arr[0].length; x++) {
                try {
                    value = Integer.parseInt(arr[i][x]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("incorrect data in arr[" + i + "][" + x + "]");
                }
                sum += value;
            }
        }
        return sum;
    }
}
