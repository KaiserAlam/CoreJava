package com.example;

public class StringBuilderDemo {

	public static void main(String[] args) {

		String palindrome = "abccba";
		
		StringBuilder sb = new StringBuilder(palindrome);
		
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb);
	}
}
