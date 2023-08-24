import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task();
    }
    public static void task() {
        System.out.println("Задание 1");
        // Массив №1.
        int [] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        // Массив №2.
        double [] numbers2 = {1.57, 7.654, 9.986};
        // Массив №3.
        int [] applesInBox = {13, 14, 12, 18, 22};

        System.out.println("Задание 2");
        for (int i = 0; i < numbers1.length; i++) {
            if (i == numbers1.length - 1) {
                System.out.println(numbers1[i]);
                break;
            }
            System.out.print(numbers1[i] + ", ");
        }
        for (int i = 0; i < numbers2.length; i++) {
            if (i == numbers2.length - 1) {
                System.out.println(numbers2[i]);
                break;
            }
            System.out.print(numbers2[i] + ", ");
        }
        for (int i = 0; i < applesInBox.length; i++) {
            if (i == applesInBox.length - 1) {
                System.out.println(applesInBox[i]);
                break;
            }
            System.out.print(applesInBox[i] + ", ");
        }

        System.out.println("Задание 3");
        for (int i = numbers1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbers1[i]);
                break;
            }
            System.out.print(numbers1[i] + ", ");
        }
        for (int i = (numbers2.length - 1); i >= 0 ; i--) {
            if (i == 0) {
                System.out.println(numbers2[i]);
                break;
            }
            System.out.print(numbers2[i] + ", ");
        }
        for (int i = (applesInBox.length - 1); i >= 0; i--) {
            if (i == 0) {
                System.out.println(applesInBox[i]);
                break;
            }
            System.out.print(applesInBox[i] + ", ");
        }

        System.out.println("Задание 4");
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] % 2 == 1) {
                numbers1[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers1));
    }
}