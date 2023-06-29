class Solution {
    public int[] replaceElements(int[] arr) {
        int max = 0;

        if(arr.length == 1){
            int[] ans = {-1};
            return ans;
        }
        for(int i =0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] > max)
                    max = arr[j];
            }
            arr[i] = max;
            max = 0;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}