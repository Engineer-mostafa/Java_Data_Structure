/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author user
 */


public class StackArray {
    final static int MAX_SIZE = 100;
    private int top;
    final private int [] items = new int [MAX_SIZE];

    StackArray(){
        top = -1;
    }


    private boolean isEmpty(){
        return top < 0;
    }

    private boolean isFull(){
       return top >= MAX_SIZE - 1;
    }

    boolean push(int element){
        if(isFull()) return false;
        else items[++top] = element; return true;
    }



    boolean pop (){
        if (isEmpty()) return false;
        else top--; return true;
    }

}
