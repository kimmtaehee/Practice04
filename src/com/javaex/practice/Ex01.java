package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] inArray = new int[5];
		
		inArray[0] = 3;
		inArray[1] = 7;
		inArray[2] = 12;
		
		
		int result = 0;
		
		for (int i =0; i<inArray.length; i++) { //5번째 방이 없기 때문에
			result = result + inArray[i];
		}
		System.out.println(result);
		
		//값이 정해지지않은 정수형이기때문에 22
	}

}
