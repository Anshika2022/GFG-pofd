class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        // Your code goes here.
        int max=Integer.MAX_VALUE, a=max, b=a;
        int c1=0,c2=0, n=nums.size();
        for(int i:nums){
            if(a==i){
                c1++;
            }else if(b==i){
                c2++;
            }else if(c1==0){
                a=i;
                c1=1;
            }else if(c2==0){
                b=i;
                c2=1;
            }else{
                c1--;
                c2--;
            }
        }
        
        c1=0;
        c2=0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i:nums){
            if(i==a)    c1++;
            else if(i==b)   c2++;
        }
        
        if(c1>n/3)  ans.add(a);
        if(c2>n/3)  ans.add(b);
        
        if(ans.size()==0)   return Arrays.asList(-1);
        return ans;
    }
}
