import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kombinasyon Hesaplama Programına Hoşgeldiniz :");
        int n, r, combination;
        int nProduct = 1, rProduct = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("n sayısını giriniz :");
        n = input.nextInt();

        System.out.print("r sayısını giriniz :");
        r = input.nextInt();

        for (int i = 1; i <= r; i++){
            rProduct *= i;
            nProduct *= n;
            n--;
        }

        combination = nProduct / rProduct;
        System.out.print("C(n,r)) " + combination);

    }
}
