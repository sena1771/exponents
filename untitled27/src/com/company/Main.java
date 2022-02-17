package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// exponents
        Scanner inp=new Scanner(System.in);
int total=1;
        System.out.print("the numb: ");
        int numb= inp.nextInt();
        System.out.print("numb to the power of: ");
        int a= inp.nextInt();
        for(int i=1;i<=a;i++ ) {
            total*=numb;

        }
        System.out.println("Total: "+total);

    }
}
