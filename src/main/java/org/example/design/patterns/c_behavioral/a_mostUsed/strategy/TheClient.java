package org.example.design.patterns.c_behavioral.a_mostUsed.strategy;

/*
 * Example using algorithm
 * 	Context doesn't HAS-A State.
 * 	Client just pass the algorithm to the context which it wants to use.
 * 	Context just executes it as 'a fire and forget task'. There is no concept of saving the object.
 * 		(i.e. In java, passing Lambda as an object to any method. The method just executes the lambda without saving it)
 */

interface Algorithm {
	public void computeAlgo();
}

class BubbleSort implements Algorithm {
	public void computeAlgo() {
		System.out.println("BubbleSort");
	}
}
class QuickSort implements Algorithm {
	public void computeAlgo() {
		System.out.println("QuickSort");
	}
}
class MergeSort implements Algorithm {
	public void computeAlgo() {
		System.out.println("MergeSort");
	}
}

class Context {
	public void execute(Algorithm algo) {
		algo.computeAlgo();
	}
}

public class TheClient {
	public static void main(String[] args) {
		Context context = new Context();
		context.execute(new QuickSort());
		context.execute(new BubbleSort());
		context.execute(new MergeSort());
		context.execute(new BubbleSort());
		context.execute(new MergeSort());
		context.execute(new QuickSort());
	}
}
