import java.util.Arrays;
import java.util.Scanner;
public class Klargest {

    static void printKLarge(int b[], int n, int k){
        Arrays.sort(b);
        System.out.println(b[k-1]);
    }
    public static void main(String[] args) {
        int a[] = {12, 13, 1, 10, 34, 1};
        Scanner sc = new Scanner(System.in);
        int n = a.length;
        int k = sc.nextInt();
        sc.close();
        if(k < n && k >= 0){
            printKLarge(a, n, k);
        }
        else{
            System.out.println("Please Enter Valid K...");
        }
    }
}
