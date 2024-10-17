
import java.util.Scanner;

public class jeruk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan jumlah jeruk:");
        int jumlah = scanner.nextInt();
        int totalharga;
        if (jumlah ==1){
            totalharga = 3000;
        }else if(jumlah ==2){
            totalharga = 1000;
        }else if(jumlah % 5 ==0){
            totalharga = jumlah * 10000/5;
        }else if(jumlah >5){
            totalharga = (jumlah / 5) * 10000 + (jumlah % 5) * 3000 - 1000;  
        }else{
            totalharga =0;
        }
        System.out.println("Beli " + jumlah + " = " + totalharga + " Rupiah");
        scanner.close();
    }
}
