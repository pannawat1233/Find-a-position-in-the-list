/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject10;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Mavenproject10 {

    public static void main(String[] args) {
        System.out.println("Enther number");
        int[][] list =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        Integer a =0;
        int L1 = 0;
        boolean found = false;
        int newSize = list.length+1;
        int[][] newlist = new int[newSize][list[0].length];
        for(; a!= null && a <= 2; a++)
        {
            int InputList = list[L1][a];
            if(InputList == number)
            {
                System.out.println("["+L1+"]"+"["+a+"]");
                break;
            }
            if (a ==null || a ==2)
            {
                L1++;
                a = 0;
            }
        
        }
        
    }
}
