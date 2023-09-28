import java.util.Scanner;

public class MoneyChange {

    static void getCoins(long m){
        long c;
        c = m / 10 + (m % 10) / 5 + ((m % 5) / 1);
        System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        getCoins(money);
    }

}
