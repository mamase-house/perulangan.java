import java.util.Scanner;

public class arraytugas {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        String[] nama = new String[5];
        int[] nilai = new int[5];
        String[] status = new String[5];

      
        for (int i = 0; i < 5; i++) {
            System.out.print("Mahasiswa Ke-" + (i + 1) + ":\n");
            System.out.print("Nama: ");
            nama[i] = scanner.nextLine();
            System.out.print("Nilai: ");
            nilai[i] = scanner.nextInt();
            scanner.nextLine(); // Mengambil newline

            if (nilai[i] >= 60) {
                status[i] = "Lulus";
            } else {
                status[i] = "Tidak Lulus";
            }
        }

        int totalNilai = 0;
        for (int n : nilai) {
            totalNilai += n;
        }
        double rataRataNilai = (double) totalNilai / 5;

      
        System.out.println("====================================");
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("=====================================");
        System.out.println("No\tNama\tNilai\tStatus");
        System.out.println("=======================================");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "\t" + nama[i] + "\t" + nilai[i] + "\t" + status[i]);
        }
        System.out.println("Jumlah: " + totalNilai);
        System.out.println("Nilai Rata-rata: " + rataRataNilai);
    }
    
}
