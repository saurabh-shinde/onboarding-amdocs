package com.amdocs;

public class AlgorithmFactory {
	
	public static IAlgorithm getAlgoDetails(int algo) {
		
		IAlgorithm algorithm = null;
		
		if( algo == 1)
			algorithm = new BubbleSort();
		else if( algo == 2)
			algorithm = new HeapSort();
		else if( algo == 3)
			algorithm = new RadixSort();
		else
			algorithm = new NullAlgorithm();
		
		return algorithm;
		
	}

}
