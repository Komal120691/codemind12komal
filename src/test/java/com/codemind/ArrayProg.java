package com.codemind;

public class ArrayProg {

	//{1,5,9,4,9,2,8}
	//print given array in ascending order
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 int number[]= {1,5,9,4,9,2,8};
 
 for (int i=0; i<number.length; i++) {
	 
	 for (int j=i+1; j<number.length; j++) {
		 
		 if (number[i]>number[j]) {
			 
			 int temp;
			 temp=number[i];
			 number[i]=number[j];
			 number[j]=temp;
		 }
	 }
 }
 System.out.println("print given array in ascending order");
 
 for (int k=0;k<number.length;k++) {
	 System.out.print(number[k]+"\t");
 }
 
 System.out.println();
 
 System.out.println("######################################################");
	
//print given array in descending order


for (int i=0; i<number.length; i++) {
	 
	 for (int j=i+1; j<number.length; j++) {
		 
		 if (number[i]<number[j]) {
			 
			 int temp;
			 temp=number[i];
			 number[i]=number[j];
			 number[j]=temp;
		 }
	 }
}
System.out.println("print given array in descending order");

for (int k=0;k<number.length;k++) {
	 System.out.print(number[k]+"\t");
	 }
System.out.println();
System.out.println("########################################################");

//print array lenght
System.out.println("lenght of array is="+number.length);
System.out.println("########################################################");

//print largest  number in given array
System.out.println("largest number in given array="+number[0]);
System.out.println("########################################################");

//print smallest number in given array
System.out.println("smallest number in given array="+number[number.length-1]);
System.out.println("########################################################");

//print 3rd largest and smallest number in given array
System.out.println("third largest number in given array="+number[2]);
System.out.println("smallest number in given array="+number[number.length-2]);
System.out.println("########################################################");
	}
	
}



