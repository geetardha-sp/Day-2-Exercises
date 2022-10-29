package com.sechpoint;

import java.util.ArrayList;
import java.util.List;

public class Library<T> {
	List<T> library = new ArrayList<T>();

	public List<T> getLibrary() {
		return library;
	}

	public void addMedia(T media) {
		this.library.add(media);
	}
}
