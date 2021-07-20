package org.example.design.patterns.c_behavioral.c_old.state;


public class Context {
	private Sort state;

	private Sort quickSort;
	private Sort mergeSort;
	private Sort bubbleSort;

	public Context() {
		quickSort = new QuickSort();
		mergeSort = new MergeSort();
		bubbleSort = new BubbleSort();
	}

	public void startWorkflow(int i) {
		if (i == 1) {
			state = bubbleSort;
			state.sortAlgorithm();
			i = 2;
		}
		if (i == 2) {
			state = mergeSort;
			state.sortAlgorithm();
			i = 3;
		}
		if (i == 3) {
			state = quickSort;
			state.sortAlgorithm();
		}
	}
}
