import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int key = 0;
        int user = 0;
        int x = 0;
        int y = 0;
        int fax = 0;
        char check = ' ';
        String encrp = "";
        String decrp = "";
        String keyword = "";
        String word1 = " ";

        while (fax == 0) {
            System.out.println("Press");
            System.out.println("(1) to encrypt \n(2) to decrypt \n(0) to exit");
            user = sc.nextInt();
            if (user < 0 || user > 2) {
                System.out.println("Invalid");
            }
            if (user == 1) {
                System.out.println("Encryption commencing");
                System.out.println("Please enter the word you would like to encrypt: ");
                sc.nextLine();
                word1 = sc.nextLine();
                count = 0;
                for (int i = 0; i < word1.length(); i++) {
                    check = word1.charAt(i);
                    if (!(check >= 'a' && check <= 'z')) {
                        count -= 100;

                    }
                }
                if (count >= 0) {
                    key = (keyWork(keyword, key, x, y));

                    if (key < 0) {
                        System.out.println("Letters must be lowercase");
                    } else {
                        System.out.println(Encryption(encrp, word1, key));
                    }
                } else {
                    System.out.println("Letters must be lowercase");
                }
            }

            if (user == 2) {
                System.out.println("Decyption commencing");
                System.out.println("Please enter the word you want to decrypt: ");
                sc.nextLine();
                word1 = sc.nextLine();
                count = 0;
                for (int i = 0; i < word1.length(); i++) {
                    check = word1.charAt(i);
                    if (!(check >= 'a' || check <= 'z')) {
                        count -= 100;
                    }
                }
                if (count >= 0) {
                    key = (keyWork(keyword, key, x, y));

                    if (key < 0) {
                        System.out.println("Letters must be lowercase");
                    } else {
                        System.out.println(Decryption(decrp, word1, key));
                    }
                } else {
                    System.out.println("Letters must be lowercase");
                }
            }

            if (user == 0) {
                fax += 1;
                System.out.println("Thank You, Goodbye");
            }
        }
    }

    public static int keyWork(String keyword, int key, int x, int y) {
        char c = ' ';
        Scanner sc = new Scanner(System.in);
        key = 0;

        System.out.println("What is your key");
        keyword = sc.nextLine();
        for (int i = 0; i < keyword.length(); i++) {
            c = keyword.charAt(i);
            if (c >= 'a' && c <= 'z') {
                x = (int) c - 96;
                key += x;
                key = key % 26;
            } else {
                key = -100;
            }
        }
        return key;
    }

    public static String Encryption(String encrp, String word1, int key) {
        int length = word1.length(), x;
        char u;
        char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't','u', 'v', 'w', 'x', 'y', 'z' };
        for (int i = 0; i < length; i++) {
            u = word1.charAt(i);
            x = (int) u - 97 - key;
            if (x < 0) {
                x = x + 26;
            }
            char y = arr[x];
            encrp += y;
        }
        return encrp;
    }

    public static String Decryption(String decrp, String word1, int key) {
        int length = word1.length(), x;
        char u;
        char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z' };
        for (int i = 0; i < length; i++) {
            u = word1.charAt(i);
            x = (int) u - 97 + key;
            if (x > 25) {
                x = x - 26;
            }
            char y = arr[x];
            decrp += y;
        }
        return decrp;
    }

}
