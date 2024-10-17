import java.util.Scanner;
public class genap {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int angka;
        System.out.print("masukan angka:");
        angka = input.nextInt();
         String nilai;
        if(angka % 2 ==0 ){
            nilai = "genap";


        }else{
            nilai = "ganjil";
        }System.out.println("dan nilainnya adalah:"+ nilai);
        input.close();
    }
}
