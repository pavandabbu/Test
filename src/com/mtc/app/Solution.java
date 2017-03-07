package com.mtc.app;


import java.util.*;
public class Solution {
 public static void main(String[] args) {

  //DoNotTerminate.forbidExit();

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   String s = new String();
   s= s.valueOf(n);
   System.out.println(s);
   if (n == Integer.parseInt(s)) {
	    System.out.println("Good job");
	   } else {
	    System.out.println("Wrong answer.");
	   }
	  } catch (Exception e) {
	   System.out.println("Unsuccessful Termination!!");
	  }
	 }
	}