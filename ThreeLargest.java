import java.io.*;
public class ThreeLargest {

    static void printLarg(int b[], int total){
        int temp = b[0];
        for(int i = 1; i<total; i++){
            if(b[i] > temp){
                temp = b[i];
            }
        }
        System.out.println(temp);
    }

    static void printThLarg(int b[], int total){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int i=0; i<total; i++){
            if(b[i] > first){
                third = second;
                second = first;
                first = b[i];
            }
            else if(b[i] > second && b[i] != first){
                third = second;
                second = b[i];
            }
            else if(b[i] > third && b[i] != second){
                third = b[i];
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }

    static void print2Larg(int b[], int total){
        int second;
        int first = second = Integer.MIN_VALUE;
        for(int i=0; i<total; i++){
            if(first < b[i]){
                second = first;
                first = b[i];
            }
            else if(second < b[i] && b[i] != first){
                second = b[i];
            }
        }
        System.out.println(second);
    }
    public static void main(String[] args) {
        int a[] = {12, 23, 1, 10, 34, 1};
        int n = a.length;
        //printLarg(a, n);
        //printThLarg(a, n);
        print2Larg(a, n);
    }
}
