import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random klavye = new Random();
        int number = klavye.nextInt(10);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.println("lütfen tahmininizi giriniz:");
            selected = input.nextInt();

            if (selected < 0 || selected > 10) {
                System.out.println("Lütfen 0-10 arasında bir değer giriniz.");
                continue;
            }
            if (selected == number) {
                System.out.println("tebrikler, doğru tahmin! Tahmin ettiğiniz sayı :" + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz.");
                if (selected > number) {
                    System.out.println(selected + "sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected;
                System.out.println(" kalan hakkı : " + (5 - right));


            }

        }
        if (!isWin &&!isWrong){
            System.out.println("Kaybettiniz !");
            System.out.println("Tahminleriniz:" + Arrays.toString(wrong));
        }



    }
}