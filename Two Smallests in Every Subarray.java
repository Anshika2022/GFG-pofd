class Solution {
    public int pairWithMaxSum(int[] arr) {
        // code here
        int max =0;
        if(arr.length<2){
            return -1;
        }
        for(int i=0;i<arr.length-1;i++){
            max =Math.max(max, arr[i]+arr[i+1]);
        }
        return max;
    }
}
