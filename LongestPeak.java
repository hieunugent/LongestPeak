class LongestPeak {
  public static int longestPeak(int[] array) {
    // Write your code here.
		int result = 0;
		for (int i = 0 ; i < array.length ; i++){
			int possibleResult = 0;
			int left = numGreaterLeft(i, i-1, array);
			//System.out.println(left);
			int right = numGreaterRight(i, i+1, array);
			//System.out.println(right);
			if (left > 0 && right > 0){
				possibleResult = left + 1 + right;
			}
			if (possibleResult > result){
				result = possibleResult;
			}
		}

    return result;
  }
	public static int numGreaterLeft(int current, int process, int [] array){
		int numGreater = 0;
		if(current == 0) return 0;
		while (process >= 0)
		{	if (array[current] <= array[process]){return numGreater;}
				numGreater++;
		 		current--;
		 		process--;
		}
		return numGreater;
	}
	public static int numGreaterRight(int current, int process, int [] array){
		int numGreater = 0;
		if(current == array.length-1) return 0;
		while (process < array.length)
		{	if (array[current] <= array[process]){return numGreater;}
				numGreater++;
		 		current++;
		 		process++;
		}
		return numGreater;
	}

}
