package test;

import java.util.function.Consumer;

public class IteratorPatternExample {

    public static void main(String[] args) {

        MyArrayList myArray = new MyArrayList(new Object[] {1,2,3,4,5}) ;
        myArray.forEach(System.out :: println);
    }

    static class MyArrayList {
        Object[] elements = new Object[5];
        public MyArrayList(Object[] elements) {
            this.elements = elements;
        }
        public void forEach(Consumer action) {
            for( int i = 0; i < elements.length ; i++){
                action.accept(elements[i]);
            }
        }

    }
}
