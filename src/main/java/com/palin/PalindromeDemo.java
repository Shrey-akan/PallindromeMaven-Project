package com.palin;

public class PalindromeDemo {
	public int show(int x) {
		int y = x;
		int count=0;
		while(y!=0) {
			y=y/10;
			count++;
		}
		int temp = (int)Math.pow(10, count-1);
		int z = x;
		int sum=0;
		while(z!=0) {
			int digit = z%10;
			sum=sum+ digit*temp;
			temp=temp/10;
			z=z/10;
		}
		int num=0;
		if(sum==x) {
			 num = sum;
		}
		return num;
		
	}
	public static void main(String[] args) {
		PalindromeDemo s = new PalindromeDemo();
		int n = 121;
		s.show(n);
		s.show(131);
	}

}
