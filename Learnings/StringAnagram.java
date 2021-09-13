package com.amadeus.learnings;

import java.util.Arrays;
import java.util.HashMap;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "geeksforgeeks";
		String b = "forgeeksgeeks";
		boolean isAnagaram = StringAnagramSolution.isAnagramSol(a, b);
		System.out.println(isAnagaram);
	}

}


class StringAnagramSolution {
	
	public static boolean isAnagramSol(String a,String b){
		if(a.length() != b.length()) {
			return false;
		}
		char[] string_a = a.toCharArray();
		char[] string_b = b.toCharArray();
		Arrays.sort(string_a);
		Arrays.sort(string_b);
		boolean status = Arrays.equals(string_a, string_b);  
		return status;
	}
	
	public static boolean isAnagram(String a,String b){
		HashMap<Character, Integer> map_a = new HashMap<>();
		HashMap<Character, Integer> map_b = new HashMap<>();
		if(a.length() != b.length()) {
			return false;
		}
		for(int i=0; i<a.length(); i++) {
			char literal = a.charAt(i);
			if(map_a.containsKey(literal)) {
				int value = map_a.get(literal);
				map_a.put(literal, ++value);
			} else {
				map_a.put(literal, 1);
			}			
		}
		for(int i=0; i<b.length(); i++) {
			char literal = b.charAt(i);
			if(map_b.containsKey(literal)) {
				int value = map_b.get(literal);
				map_b.put(literal, ++value);
			} else {
				map_b.put(literal, 1);
			}			
		}
		if(map_a.equals(map_b))
			return true;
		else
			return false;
	}
}