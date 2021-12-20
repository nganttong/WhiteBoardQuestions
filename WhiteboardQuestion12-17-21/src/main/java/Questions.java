public class Questions {
    public int sumOfSubarrays(int[] array) {
        //Given:{1,3,5,4}
        //Sum of Subarrays
        //where the subarray begins, size of array, where it ends
            int sum = 0;
            for (int i = 0; i <= array.length; i++) {
                for (int j = 0; j <= array.length; j++) {
                    for (int k = i; k < j; k++) {
                        sum += array[k];
                    }
                }
            } return sum;
        }
        //TODO -Look at j and k loop structure, tweak something small on both
        //done


    //solution from Jack Harris to solve problem
    public Integer solveWithMath(Integer[] input){
        Integer sum = 0;
        for(int i = 0; i < input.length; i++)
            sum += input[i] * (i + 1) * (input.length - i);
        return sum;
    }

    public Long solveWithLong(Integer[] input){
        Long sum = 0l;
        for(int i = 0; i < input.length; i++)
            sum += input[i] * (i + 1) * (input.length - i);
        return sum;
    }
}
