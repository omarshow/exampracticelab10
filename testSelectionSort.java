package exampracticelab10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort {

	//@Test
	void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	public testSelectionSort()
	{
		
	}
	@Test
	void testPositive() 
	{
		  int [] array = {5,6,1,8,3,9,4,7};
		  SelectionSort temporary = new SelectionSort();
	      int[] expected = {1,3,4,5,6,7,8,9};
	      int[] actual = temporary.basicSelectionSort(array);
	      assertArrayEquals(expected, actual);
	}
	@Test
	void testNegative()
	{
		  int [] array = {-5,-6,-1,-8,-3,-9,-4,-7};
		  SelectionSort temporary = new SelectionSort();
	      int[] expected = {-9,-8,-7,-6,-5,-4,-3,-1};
	      int[] actual = temporary.basicSelectionSort(array);
	      assertArrayEquals(expected, actual);
	}
	@Test
	void testMixed()
	{
		int [] array = {5,-6,1,-8,3,9,-4,-7,0};
		  SelectionSort temporary = new SelectionSort();
	      int[] expected = {-8,-7,-6,-4,0,1,3,5,9};
	      int[] actual = temporary.basicSelectionSort(array);
	      assertArrayEquals(expected, actual);
	}
	@Test
	void testDuplicates()
	{
		int [] array = {5,5,-1,-1,8,3,9,9,7};
		  SelectionSort temporary = new SelectionSort();
	      int[] expected = {-1,-1,3,5,5,7,8,9,9};
	      int[] actual = temporary.basicSelectionSort(array);
	      assertArrayEquals(expected, actual);
	}
}
