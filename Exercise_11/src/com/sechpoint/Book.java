package com.sechpoint;

public class Book extends Media {
	public Book(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Book [name=" + name + "]";
	}
}
