package com.smriti;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float r;
        double pi;
        double area;
        pi =3.1416;
        System.out.print("Enter the radius of the circle: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        area = pi* r * r;
        System.out.print("Area of the circle is: "+area);
    }
}
