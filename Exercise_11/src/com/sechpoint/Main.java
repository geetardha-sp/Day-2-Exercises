package com.sechpoint;

public class Main {
	@SuppressWarnings("unchecked")
	public static <T> void main(String[] args) {
		Library<T> myLibrary = new Library<T>();
		
		System.out.println(myLibrary.getLibrary());
		
		Book book_1 = new Book("Book 1");
		Book book_2 = new Book("Book 2");
		Book book_3 = new Book("Book 3");
		Video video_1 = new Video("Video_1");
		NewsPaper newsPaper_1 = new NewsPaper("News Paper 1");
		
		myLibrary.addMedia((T) book_1);
		myLibrary.addMedia((T) book_2);
		myLibrary.addMedia((T) book_3);
		myLibrary.addMedia((T) video_1);
		myLibrary.addMedia((T) newsPaper_1);
		
		System.out.println(myLibrary.getLibrary());
	}
}
