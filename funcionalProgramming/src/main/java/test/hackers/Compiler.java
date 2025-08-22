package test.hackers;

import java.util.Stack;

public class Compiler {


    public static void main(String[] args) {

        String [] arr = {"{","{","}","}", "[","]"};


        System.out.println("Está ok el arreglo? " +validarLlaves(arr));
    }

    private static boolean validarLlaves(String [] arr){

        Stack<String> myStack = new Stack<>();


        for (String element :arr) {
            if( element.equals("{") || element.equals("[")){
                myStack.push(element);
            } else if(element.equals("}") || element.equals("]")) {
                if(myStack.isEmpty()){
                 return false;
                }
                myStack.pop();
            }
        }
        return myStack.isEmpty();
    }
}
