import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ввод массива
        Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         char[] string = new char[n];
         for (int i = 0; i != n; i++) {
            string[i] = in.next().charAt(0);
         }
        int key = in.nextInt();
        string = encrypt(string, key);
        // Шифровка
        for (char row : string) {
            System.out.println(row);
        }
    }
    public static char[] encrypt(char[] array, int key) {
        char[] result = new char[array.length];
        for (int i = 0; i != array.length; i++) {
            if ((int) array[i] >= 97 && (int) array[i] <= 122) {
                if (((((int) array[i]) - 97 + key % 26)) % 26 >= 0) {
                    result[i] = (char) (97 + ((((int) array[i]) - 97 + key % 26)) % 26);
                } else {
                    result[i] = (char) (123 + ((((int) array[i]) - 97 + key % 26)) % 26);
                }
            } else {
                if (((((int) array[i]) - 65 + key % 26)) % 26 >= 0) {
                    result[i] = (char) (65 + ((((int) array[i]) - 65 + key % 26)) % 26);
                } else {
                    result[i] = (char) (91 + ((((int) array[i]) - 65 + key % 26)) % 26);
                }
            }
        }
        return result;
    }

    public static char[] encrypt(String string, int key) {
        char[] array = string.toCharArray();
        char[] result = new char[array.length];
        for (int i = 0; i != array.length; i++) {
            if ((int) array[i] >= 97 && (int) array[i] <= 122) {
                if (((((int) array[i]) - 97 + key % 26)) % 26 >= 0) {
                    result[i] = (char) (97 + ((((int) array[i]) - 97 + key % 26)) % 26);
                } else {
                    result[i] = (char) (123 + ((((int) array[i]) - 97 + key % 26)) % 26);
                }
            } else {
                if (((((int) array[i]) - 65 + key % 26)) % 26 >= 0) {
                    result[i] = (char) (65 + ((((int) array[i]) - 65 + key % 26)) % 26);
                } else {
                    result[i] = (char) (91 + ((((int) array[i]) - 65 + key % 26)) % 26);
                }
            }
        }
        return result;
    }
    public static char[] decrypt(char[] array, int key) {
        return encrypt(array, -key);
    }

    public static char[] decrypt(String string, int key) {
        return encrypt(string, -key);
    }
}