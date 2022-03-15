package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
	 
	System.out.println("Welcome to Line Comparison Computation Program");
     Scanner in = new Scanner(System.in);
     System.out.println("Enter coordinates of line L1");
        
     Point p1 = new Point();
     System.out.println("Enter the value of x1 : ");
     p1.x = in.nextInt();
     System.out.println("Enter the value of y1 : ");
     p1.y = in.nextInt();
     System.out.println("Enter coordinates of line L1");
     Point p2 = new Point();
     System.out.println("Enter the value of x2 : ");
     p2.x = in.nextInt();
     System.out.println("Enter the value of y2 : ");
     p2.y = in.nextInt();
     System.out.println("Enter coordinates of line L2");
     Point p3 = new Point();
     System.out.println("Enter the value of x3 : ");
     p3.x = in.nextInt();
     System.out.println("Enter the value of y3 : ");
     p3.y = in.nextInt();
     Point p4 = new Point();
     System.out.println("Enter the value of x4 : ");
     p4.x = in.nextInt();
     System.out.println("Enter the value of y4 : ");
     p4.y = in.nextInt();
     
     double length = Math.sqrt(Math.pow((p1.x - p2.x), 2) + Math.pow((p1.y - p2.y), 2));
	System.out.println("Length of Line"+length);	   
	}
}