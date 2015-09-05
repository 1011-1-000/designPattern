package org.design.pattern.adapter;

/**
 * @desciption: No description
 * @author : »ÆÓ¦Ïè(http://passwarer.github.io/)
 * @date : 2015-9-5ÉÏÎç11:33:14
 */
public class OperationAdapter implements ScoreOperation{
	
	private QuickSort quickSort;
	private BinarySearch binarySearch;
	
	

	public OperationAdapter() {
		this.quickSort = new QuickSort();
		this.binarySearch = new BinarySearch();
	}

	@Override
	public int[] sort(int[] array) {
		// TODO Auto-generated method stub
		int[] a = {1,1};
		quickSort.quickSort();
		return a;
	}

	@Override
	public int search(int[] array, int key) {
		// TODO Auto-generated method stub
		binarySearch.binarySearch();
		return 0;
	}

}
