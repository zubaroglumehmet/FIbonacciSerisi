import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int eleman,sayi=0,sayi2=1;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz");
        eleman= scanner.nextInt();
        if (eleman >= 1) {
            System.out.print(sayi + " ");
        }
        if (eleman >= 2) {
            System.out.print(sayi2 + " ");
        }
        for (int i = 3; i <= eleman; i++) {
            int sonuc = sayi + sayi2;
            System.out.print(sonuc + " ");

            sayi = sayi2;
            sayi2 = sonuc;
        }

    }
}