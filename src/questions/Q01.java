package questions;

import java.util.ArrayList;
import java.util.List;

public class Q01 {
    public static void main(String[] args) {

        int a[][] = { {3,6,2}, {1,5,6}, {2,1,5} };
        int b[][] = { {1,1,2}, {3,3,3}, {2,2,1} };

        result(a, b);

    }

    //A dizisinde olup B dizisinde olmayan elemanları bulunuz.
    public static void result(int a[][], int b[][]){

       List<Integer> listB = new ArrayList<>();

        for (int[] w1 : a) {
            for (int i1 : w1) {

                for (int[] w2 : b) {
                    for (int i2 : w2) {
                       listB.add(i2);
                    }
                }

                if(!listB.contains(i1)){
                    System.out.print(i1 + " ");
                }
            }
        }

    }

}
