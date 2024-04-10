package com.coderscampus;

public interface CustomList<T> {

	boolean add(T item);

	boolean add(int index, T item);

	int getSize();

	T get(int index);

	T remove(int index);

}
