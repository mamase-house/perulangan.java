import java.util.ArrayList;
import java.util.Scanner;

public class jerukribet {
    public static void main(String[] args) {
          String[][] buah = {
                {"apel", "35000"},
                {"jeruk", "50000"},
                {"mangga", "25000"},
                {"duku", "15000"},
                {"semangka", "20000"}
        };
        
        // ArrayList untuk menyimpan daftar belanja
        ArrayList<String[]> keranjangBelanja = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        int total = 0;

        do {
            // Tampilkan menu
            System.out.println("Menu:");
            System.out.println("1. Beli Buah");
            System.out.println("2. Struk Belanja");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Tampilkan daftar buah
                    System.out.println("Daftar Buah:");
                    for (int i = 0; i < buah.length; i++) {
                        System.out.println(i + ". " + buah[i][0] + " - Rp " + buah[i][1]);
                    }

                    // Pilih buah
                    System.out.print("Pilih Buah (0-" + (buah.length - 1) + "): ");
                    int pilihanBuah = scanner.nextInt();

                    // Masukkan jumlah
                    System.out.print("Masukkan jumlah: ");
                    int jumlah = scanner.nextInt();

                    // Hitung subtotal
                    int harga = Integer.parseInt(buah[pilihanBuah][1]);
                    int subtotal = harga * jumlah;

                    // Tambahkan buah ke keranjang belanja
                    keranjangBelanja.add(new String[]{buah[pilihanBuah][0], String.valueOf(jumlah), String.valueOf(harga), String.valueOf(subtotal)});
                    total += subtotal;

                    // Tanyakan apakah ingin membeli lagi
                    System.out.print("Input lagi (y/n)? ");
                    char lagi = scanner.next().charAt(0);
                    if (lagi == 'n' || lagi == 'N') {
                        pilihan = 2; // Langsung menuju struk belanja jika tidak ingin beli lagi
                    }
                    break;

                case 2:
                    // Tampilkan struk belanja
                    System.out.println("\nDaftar Belanja:");
                    System.out.println("No.\tNama Buah\tJumlah\tHarga\tSubtotal");
                    for (int i = 0; i < keranjangBelanja.size(); i++) {
                        String[] item = keranjangBelanja.get(i);
                        System.out.println((i + 1) + "\t" + item[0] + "\t" + item[1] + "\tRp " + item[2] + "\tRp " + item[3]);
                    }
                    System.out.println("Total: \t\t\t\t\tRp " + total);

                    // Hitung diskon 15%
                    double diskon = total * 0.15;
                    double totalBayar = total - diskon;

                    System.out.println("Diskon (15%): \t\t\t\tRp " + (int) diskon);
                    System.out.println("Total bayar: \t\t\t\tRp " + (int) totalBayar);
                    break;

                case 3:
                    System.out.println("Terima kasih telah berbelanja!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 3);

        scanner.close();
    }
}
