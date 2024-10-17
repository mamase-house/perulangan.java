import java.util.Scanner;
public class nilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nanti di kos di kerjain bbuat belajar
        int nilai;
        
        System.out.print("masukan nilai:");
        nilai = sc.nextInt();
        String hasil;

        if (nilai >= 80  ) {
            hasil = "A";
            
        }else if(nilai >= 75){
            hasil = "B";
        }else if (nilai >= 65) {
            hasil ="C";
        } else if(nilai >=55){
            hasil = "D";
        }else{
            hasil = "E";
        }
        
        System.out.print("maka nilai anda "+hasil);
        sc.close();



    }
    
}
