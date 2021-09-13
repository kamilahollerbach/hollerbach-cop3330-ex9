/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kamila Hollerbach
 */

package com.company;
import java.util.Scanner;
import java.lang.*;




public class Main {

    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);
        System.out.println("Please enter the length and breadth of the ceiling in feet: ");

        float length = st.nextFloat();
        float breadth = st.nextFloat();
        float area = length * breadth;
        int result = (int) Math.ceil(area / 350);
        System.out.println("You will need to purchase "+result+" gallons of paint to cover "+area+" square feet");
        }
    }

