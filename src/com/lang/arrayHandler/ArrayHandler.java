package com.lang.arrayHandler;

public class ArrayHandler {

	public static void main(String[] args) {
		//ssumofNextDigits();
		

	}

	private static void sumofNextDigits() {
		int inputarr[] = new int[] {1,6,8,5,9,4,7,2,3,4,5,6,6};
		int count = 1;
		int index = 1;
		int[] result = new int[inputarr.length];
		result[0] = inputarr[0];
		
		for(int i= 1; i<inputarr.length-1;i++) {
			int value =0;
			for(int j=1;j<=i;j++) {
				if(index>=inputarr.length) {
					
				}
			}
			
		
			index++;
			i=i+count;
			
		}
		
		for(int j=0;j<result.length;j++) {
			System.out.println(result[j]);
		}
		
	}

}
