package test.hackers;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;

public class Deque {


    public static void main(String[] args) {

        int n =  6;
        int m = 4;
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Integer[] arreglo = {5,3,5,2,3,1};
        int max = 0;
        

        for(int i=0; i < arreglo.length; i++){
            deque.addLast(arreglo[i]);
        }

        Object[] array = deque.toArray();

        outerloop: for (int i = 0; i < arreglo.length; i++){

            HashSet maxHash = new HashSet();
            int j = 0;
            for (; j < m; j++){
                if(i+j >= array.length){
                    break outerloop;
                }
                maxHash.add(array[i+j]);
            }

            if (maxHash.size() > max){
                max = maxHash.size();
            }

        }

        System.out.println(max);

    }

}
