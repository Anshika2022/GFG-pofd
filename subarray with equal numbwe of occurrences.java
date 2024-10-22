class Solution {

    static int sameOccurrence(int arr[], int x, int y) {
        // write code here
        HashMap<Integer,Integer> h = new HashMap<>();
        int diff = 0;
        int count = 0;
        h.put(0,1);
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==x){
                diff++;
            }
            if(arr[i]==y){
                diff--;
            }
            if(h.containsKey(diff)){
                 count += h.get(diff);
                
               
            }
               
             h.put(diff,h.getOrDefault(diff,0)+1);   
           
        }
        return count;
    }
}
