import java.util.Arrays;

public class Zadacha {

    public static void main(String[] args) {
        int[] array1 = new int[] { 1, 9, 9, 0, 2, 8, 0, 9 };
        int count = 1;
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[i] == array1[j]) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(array1[i] + " встречается " + count + " раза");
                i = i + count - 1;
            }
            count = 1;
        }
    }
}