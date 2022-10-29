package com.sechpoint;

public class NewsPaper extends Media {
	public NewsPaper(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "NewsPaper [name=" + name + "]";
	}
}
