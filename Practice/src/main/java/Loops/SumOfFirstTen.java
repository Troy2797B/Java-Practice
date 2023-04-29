package Loops;

import java.util.ArrayList;

public class SumOfFirstTen {
    //Write a program to calculate the sum of first 10 natural numbers. As an added layer it adds togethe 10 random numbers between 1 and 100.
    //public static ArrayList<Integer> arr = new ArrayList<>();

    //this method make a random number
    public static Integer getNumber(){
        int min = 1;
        int max = 100;
        return (int) (Math.random() * (max+min));
    }

    //this method below loads an arraylist with 10 numbers
    public ArrayList<Integer> loadArray(){
        ArrayList<Integer> arr = new ArrayList<>();
        while (arr.size() < 10){
            arr.add(getNumber());
        }
        System.out.println(arr);
        return arr;
    }

    //add all together
    public Integer addAllIntegers(){
        ArrayList<Integer> arr = loadArray();
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }
    public static void main(String[] args) {
        SumOfFirstTen hi = new SumOfFirstTen();
        System.out.println(hi.addAllIntegers());
    }
    //loop through list adding each one to the other
    //print result
}
