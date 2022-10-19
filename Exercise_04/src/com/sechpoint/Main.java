package com.sechpoint;

import java.util.Map;

public class Main {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		String string = "dgdfgdfhdfsdfsdfdgdfhgfjghjgfhjghjgfghdfgdfgsdfsdcfdfgfgnmfzsdfdfdffffsdfsddasdsghjhgg";
        
        for (Map.Entry entry : new Exercise4().countCharacters(string).entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
	}
}
