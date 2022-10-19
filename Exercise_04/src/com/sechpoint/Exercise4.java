package com.sechpoint;

import java.util.HashMap;

public class Exercise4 {
	public HashMap<Character, Integer> countCharacters(String string){
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		char[] stringArray = string.toCharArray();
		
		for (char c : stringArray){
			if (hashMap.containsKey(c)){
				hashMap.put(c, hashMap.get(c) + 1);
			}
			else {
				hashMap.put(c, 1);
			}
		}
		
		return hashMap;
	}
}
