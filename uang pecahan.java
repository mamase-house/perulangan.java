import java.util.Scanner;

public class pemecahan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahUang, uang200an, uang100an, uang1000an, uang2000an, uang5000an, uang10000an, uang20000an, uang50000an, uang100000an;

        System.out.print("Masukkan nilai uang:");
        jumlahUang = sc.nextInt();

        uang100000an = jumlahUang / 100000;
        jumlahUang %= 100000;
        if (uang100000an != 0) {
            System.out.println(uang100000an + " keping 100000");
        }
        uang50000an = jumlahUang / 50000;
        jumlahUang %= 50000;
        if (uang50000an != 0) {
            System.out.println(uang50000an + " keping 50000");
        }
        uang20000an = jumlahUang / 20000;
        jumlahUang %= 20000;
        if (uang20000an != 0) {
            System.out.println(uang20000an + " keping 20000");
        }
        uang10000an = jumlahUang / 10000;
        jumlahUang %= 10000;
        if (uang10000an != 0) {
            System.out.println(uang10000an + " keping 10000");
        }
        uang5000an = jumlahUang / 5000;
        jumlahUang %= 5000;
        if (uang5000an != 0) {
            System.out.println(uang5000an + " keping 5000");
        }
        uang2000an = jumlahUang / 2000;
        jumlahUang %= 2000;
        if (uang2000an != 0) {
            System.out.println(uang2000an + " keping 2000");
        }
        uang1000an = jumlahUang / 1000;
        jumlahUang %= 1000;
        if (uang1000an != 0) {
            System.out.println(uang1000an + " keping 1000");
        }
        uang200an = jumlahUang / 200;
        jumlahUang %= 200;
        if (uang200an != 0) {
            System.out.println(uang200an + " keping 200");
        }
        uang100an = jumlahUang / 100;
        jumlahUang  %= 100;
        if (uang100an != 0) {
            System.out.println(uang100an + " keping 100");
        }

        sc.close();
    }
}
