package com.codemind;


//print given array in descending order
//{1,5,9,4,9,2,8}

public class ArrayInDes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[]= {1,5,9,4,9,2,8};
		 
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
	}
	System.out.println();
	System.ount.println("################################################################");
	
		 
         
         
			 
		 
	
	
		 
	
		 

