import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class MaxSalary {

    static void getMaxSalary(int n, ){
        int r, count=0;
        int arr[20] = {};
        while(n >= 0){
            r = n%10;
            arr[count] = r;
            count++;
            n = n/10;
        }
        System.out.println(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<String> v = new Vector<String>(n);
        for (int i = 0; i < n; i++){
            v.addElement(sc.next());
        }
        getMaxSalary(n, v);
    }
}
