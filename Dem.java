import java.util.Scanner;

public class Dem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            System.out.print(a[j] + ", ");
        }
        for (int k = 0; k < n; k++) {
            System.out.print(b[k]);
        }
    }
}

