package org.example;

public class Main {
    public static void main(String[] args) {
       int result = matchResult(1,2,5,2);
        System.out.println(result);
    }
    public static int matchResult( int result1, int result2, int bet1, int bet2 ) {
        return (result1 == bet1 && result2 == bet2) ?
                2 : (result1 > result2 && bet1 > bet2) ?
                1 : (result2 > result1 && bet2 > bet1)  ?
                1 : (result1 == result2 && bet1 == bet2) ?
                1 : 0;
    }
}