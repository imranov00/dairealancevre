import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r,alan, a, pi=3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yarıçap giriniz : ");
        r=scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Merkez Açısını Giriniz: ");
        a=scanner1.nextDouble();

        alan=(pi*(r*r)*a)/360;
        System.out.println("Dairenin Alanı :" + alan);



        }

    }
