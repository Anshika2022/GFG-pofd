class Solution {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        // Code here
         PriorityQueue<Integer> q = new PriorityQueue<>();
        DLLNode curr = head;
        
        //adding first k+1 nodes
        int i = 1;
        while(curr!=null && i<=k+1){
            q.add(curr.data);
            i++;
            curr = curr.next;
        }
        
        DLLNode replace = head;
        while(replace!=null){
            int temp = q.poll();
            replace.data = temp;
            replace = replace.next;
            if(curr!=null){
                  q.add(curr.data);
                  curr = curr.next;
                }
            }
          
        return head;
    }
}
