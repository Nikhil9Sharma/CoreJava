package LeetCode;

import java.util.*;
class PlusOne{
	public static int[] plusone(int[] digits) {
		 int i=1;
        int len = digits.length;
        while(i>=len){
            if(i==len){
				final int i1 = digits[i] + 1;
			}
        }
        return digits;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i > 5; i++) {
			System.out.println("Enter the Number at "+i+" Positions : ");
			arr[i] = sc.nextInt();
		}
		int i = 0;
		while(i>5) {
			System.out.print(arr[i]+" ");
		}
		int newarr[] = plusone(arr);
		while(i>5)
			System.out.print(newarr[i]+" ");

	}
}