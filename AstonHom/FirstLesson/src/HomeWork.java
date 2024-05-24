public class HomeWork {

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -2;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value  = 7520;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = -2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean sumRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void numberSign(int number1) {
        if (number1 < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Положительное");
        }
    }

    public static boolean numberDef(int number2) {
        if (number2 < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void repeatString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        boolean divisibleBy4 = year % 4 == 0;
        boolean divisibleBy100 = year % 100 == 0;
        boolean divisibleBy400 = year % 400 == 0;
        return divisibleBy4 && (!divisibleBy100 || divisibleBy400);
    }

    public static void flipArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    public static void printArray1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] fillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void printArray2(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static int[] initializeArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void main(String[] args) {

        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

        System.out.println(sumRange(5, 9));

        numberSign(0);

        System.out.println(numberDef(-5));

        String str = "Hello, World!";
        int count = 5;
        repeatString(str, count);

        int year = 2024;
        boolean isLeap = isLeapYear(year);
        System.out.println(year + " год " + (isLeap ? "високосный" : "не високосный"));

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив: ");
        printArray1(arr1);
        flipArray(arr1);
        System.out.println("Массив после замены: ");
        printArray1(arr1);

        int[] array = fillArray();
        printArray2(array);

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив:");
        printArray2(arr2);
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
            }
        }
        System.out.println("\nМассив после умножения чисел меньше 6 на 2:");
        printArray2(arr2);

        int size = 5;
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            arr[i][i] = 1;
        }
        printArray2(arr2);

        int len = 5;
        int initialValue = 10;
        int[] arr3 = initializeArray(len, initialValue);
        System.out.println("Массив длиной " + len + " со значением " + initialValue + ":");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
