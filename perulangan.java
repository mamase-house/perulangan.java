public class TugasPerulangan {
    public static void main(String[] args) {
        // Baris 1: 2, 4, 6, ..., 32 (deret genap)
        System.out.println("Shaf 1: Genap");
        for (int i = 2; i <= 32; i += 2) {  
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
            k = k + a;  
            a = a + 2;  
        }
        System.out.println("\n");

        // Shaf 4: 1, 2, 4, 7, ..., 121
        System.out.println("Shaf ke 4");
        int prev1 = 1, prev2 = 2, prev3 = 4; 
        System.out.print(prev1 + " " + prev2 + " " + prev3 + " ");
        for (int i = 4; i <= 14; i++) { 
            int next = prev1 + prev2 + prev3; 
            System.out.print(next + " "); 
            prev1 = prev2; 
            prev2 = prev3; 
            prev3 = next; 
        }
        System.out.println("\n");

        // Shaf 5: 0, 1, 1, 2, ..., 610
        System.out.println("Shaf ke 5");
        int fib1 = 0, fib2 = 1;
        System.out.print(fib1 + " " + fib2 + " ");
        for (int i = 2; i < 16; i++) { 
            int nextFib = fib1 + fib2; 
            System.out.print(nextFib + " ");
            fib1 = fib2; 
            fib2 = nextFib; 
        }
    }
}
