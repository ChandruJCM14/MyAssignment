package week2.day1;

import java.util.Arrays;

public class FindingMissingElement {

	public static void main(String[] args) {
		int arr[]={1,4,3,2,8,6,7};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[0]+i != arr[i]) {
				System.out.println("The Missing Element is:"+arr[i]);
				break;
			}
		}

	}

}
