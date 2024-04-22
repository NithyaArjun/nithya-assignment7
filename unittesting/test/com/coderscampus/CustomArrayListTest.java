package com.coderscampus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	CustomList<String> customList = new CustomArrayList<>();

	@Test
	void should_set_new_item_toList() {

		CustomList<Integer> sut = new CustomArrayList<>();

		for (int i = 0; i < 10; i++) {
			sut.add(i);
		}

		sut.remove(9);
		sut.remove(7);
		sut.add(1000);
		sut.add(7, 1001);
		sut.add(7, 1002);
		sut.add(7, 89);
		sut.remove(7);
		sut.add(2000);
		sut.add(3000);
		customList.add("item1");
		assertEquals(1, customList.getSize());
		assertEquals("item1", customList.get(0));
		customList.add("item2");
		assertEquals(2, customList.getSize());
		assertEquals("item2", customList.get(1));

	}

	@Test
	void should_set_one_item_at_specific_index() {

		customList.add(1, "Item 1");
		assertEquals("Item 1", customList.get(1));
		customList.add(2, "Item 2");
		assertEquals("Item 2", customList.get(2));
	}

	@Test
	void should_get_size_of_List() {

		customList.add("item1");
		customList.add("item2");
		customList.add("item3");
		customList.add("item4");
		assertEquals(4, customList.getSize());

	}

	@Test
	void should_get_item_at_index() {

		customList.add("item5");
		customList.add("item6");
		customList.add("item7");
		customList.add("item8");
		customList.add("item9");
		assertEquals("item5", customList.get(0));
		assertEquals("item6", customList.get(1));
		assertEquals("item7", customList.get(2));
		assertEquals("item8", customList.get(3));
		assertEquals("item9", customList.get(4));

	}

	@Test
	void should_remove_item_at_index() {

		customList.add("item5");
		customList.add("item6");
		customList.add("item7");
		customList.add("item8");
		customList.add("item9");
		customList.remove(2);
		assertEquals("item8", customList.get(2));
		assertEquals("item9", customList.get(3));

	}

}
