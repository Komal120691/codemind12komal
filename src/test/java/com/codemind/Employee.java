package com.codemind;

 class Employee {
	 int a=21;
	 String str="komal";
	 float f=10.5f;
	 
	 static int b=30;
	 static String s="urvi";
	 
	 final float c=70.9f;
	 final int mob_no= 1234567890;
	 
	 public void addition() {
		 
		 
		 int d=a+b;
		 System.out.println("addition:"+d);
	 }

	 
	 public void subtraction() {
		 
		 float e= f-c;
		 System.out.println("subtraction:"+e);
	 }
	 
 }
	 public class typesofvariables {
		 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		variables var=new variables();
		
		var.addition();
		var.subtraction();
		System.out.println("name:" +variables.s);
		System.out.println("number:"+variables.b);
		System.out.println("mob no:"+var.mob_no);
		System.out.println("name:"+var.str);
	}

}
