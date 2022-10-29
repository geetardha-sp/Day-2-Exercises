package com.sechpoint;

public class Video extends Media {
	public Video(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Video [name=" + name + "]";
	}
}
