package com.amadeus.learnings;

import java.util.HashMap;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "act";
		String b = "tac";
		boolean isAnagaram = StringAnagramSolution.isAnagram(a, b);
		System.out.println(isAnagaram);
	}

}


class StringAnagramSolution {
	public static boolean isAnagram(String a,String b){
		HashMap<Character, Integer> map_a = new HashMap<>();
		HashMap<Character, Integer> map_b = new HashMap<>();
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