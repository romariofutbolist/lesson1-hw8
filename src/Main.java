import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task1();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задачи 1 и 2");
        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        for (int j : box) {
            System.out.print(j + " ");
        }
        System.out.println();
        double[] fractions = {1.57, 7.654, 9.986};
        for (double fraction : fractions) {
            System.out.print(fraction + " ");
        }
        System.out.println();
        int[] array = new int[] {8, 2, 6, 4};
        int one = 1;
        int two = 0;
        int three = 3;
        int four = 2;
        System.out.print(array[one] + " " + array[two] + " " + array[three] + " " + array[four]);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        for (int i = box.length - 1; i >= 0; i--) {
            System.out.print(box[i]);
            if (box[i] != box[0]) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] fractions = {1.57, 7.654, 9.986};
        for (int i = fractions.length - 1; i >= 0; i--) {
            System.out.print(fractions[i]);
            if (fractions[i] != fractions[0]) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] array = new int[]{8, 2, 6, 4};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (array[i] != array[0]) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] box = new int[3];
        box[0] = 1;
        box[1] = 2;
        box[2] = 3;
        for (int i = 0; i < box.length; i++) {
            if (box[i] % 2 != 0) {
                box[i]++;
            }
        }
            System.out.println(Arrays.toString(box));
    }
}

