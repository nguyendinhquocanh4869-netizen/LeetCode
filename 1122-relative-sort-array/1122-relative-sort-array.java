class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int idx=0;
        boolean[] used = new boolean[arr1.length];
    
        for(int i=0; i<arr2.length;i++){
            for(int j=0; j<arr1.length;j++){
                if(arr2[i] == arr1[j]){
                 result[idx] = arr1[j];
                 idx++;
                 used[j] = true;
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(!used[i]){
                result[idx] = arr1[i];
                idx++;
            }
        }

        int count = 0;
        for(int i=0; i<result.length;i++){
            if(used[i]) count++;
        }
        for(int i = count; i<result.length-1;i++){
            boolean swapped = false;
            for(int j=count;j<result.length-1;j++){
                if(result[j] > result[j+1]){
                    int temp = result[j];
                    result[j] = result[j+1];
                    result[j+1] = temp;

                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        return result;
    }
}