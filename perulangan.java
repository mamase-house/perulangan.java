public class TugasPerulangan {
    public static void main(String[] args) {
        // Baris 1: 2, 4, 6, ..., 32 (deret genap)
        System.out.println("Shaf 1: Genap");
        for (int i = 2; i <= 32; i += 2) {  // Mulai dari 2 dan increment 2
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Shaf 2: 25, 20, 15, ..., -45
        System.out.println("Shaf ke 2");
        for (int x = 25; x >= -45; x -= 5) {
            System.out.print(x + " ");
        }
        System.out.println("\n");

        // Shaf 3: 1, 1, 3, 7, ..., 221
        System.out.println("Shaf ke 3");
        int k = 1, a = 2;
        while (k <= 221) {
            System.out.print(k + " ");
            k = k + a;  // Tambah nilai a ke k
            a = a + 2;  // Increment a
        }
        System.out.println("\n");

        // Shaf 4: 1, 2, 4, 7, ..., 121
        System.out.println("Shaf ke 4");
        int prev1 = 1, prev2 = 2, prev3 = 4; // Inisialisasi dengan tiga angka pertama
        System.out.print(prev1 + " " + prev2 + " " + prev3 + " ");
        for (int i = 4; i <= 14; i++) { // Dari ke-4 sampai ke-14
            int next = prev1 + prev2 + prev3; // Hitung angka selanjutnya
            System.out.print(next + " "); // Cetak angka selanjutnya
            prev1 = prev2; // Update prev1
            prev2 = prev3; // Update prev2
            prev3 = next; // Update prev3
        }
        System.out.println("\n");

        // Shaf 5: 0, 1, 1, 2, ..., 610
        System.out.println("Shaf ke 5");
        int fib1 = 0, fib2 = 1;
        System.out.print(fib1 + " " + fib2 + " ");
        for (int i = 2; i < 16; i++) { // Dari ke-2 sampai ke-16
            int nextFib = fib1 + fib2; // Hitung angka Fibonacci selanjutnya
            System.out.print(nextFib + " "); // Cetak angka Fibonacci selanjutnya
            fib1 = fib2; // Update fib1
            fib2 = nextFib; // Update fib2
        }
    }
}
