import java.util.Scanner;

public class LastDigitOfFibo {
    static long lastDigit(int n){
        long k=0;
        if (n <= 1) 
            k = n;
        long previous = 0;
        long current = 1;
        long tmp_previous = 0;

        for (int i = 0; i < n-1; ++i) {
            tmp_previous = previous;
            previous = current;
            current = (tmp_previous + current) % 10;
            k=current;
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(lastDigit(n));
    }
}
