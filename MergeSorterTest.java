import static org.junit.Assert.*;

import org.junit.Test;

public class MergeSorterTest {

	
	@Test
	public void testBinarySearch() {
		int[] test1 = {13, 2, 7, 12, 15, 4, 11, 6, 10, 9, 3, 1, 14, 5, 8};
		MergeSorter.mergeSort(test1, 0, 14);
		assertEquals(0, BinarySearch.binarySearch(test1, 0, 14, 1));
		assertEquals(-1, BinarySearch.binarySearch(test1, 0, 14, 17));
		assertEquals(5, BinarySearch.binarySearch(test1, 0, 14, 6));
	}

}
