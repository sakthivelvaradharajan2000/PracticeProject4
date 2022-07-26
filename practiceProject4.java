package sample;

import java.util.Arrays;
import java.util.Scanner;

public class practiceProject4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max =0,temp=0,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		int dup_arr[] = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			dup_arr[i]=1;
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<i;j++) {
		    	if(arr[i]>=arr[j]) {
		    	dup_arr[i] = Math.max(dup_arr[j]+1,dup_arr[i]);
		    	}
		    }
		}
	
		for(int k=0;k<n;k++) {
			if(max<dup_arr[k]) {
				max = dup_arr[k];
			}
		}
		System.out.println("Length of longest subsequence is "+ max);
	
}
}