class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int s : stones){
            minHeap.offer(-s);
        }
        while(minHeap.size()>1){
            int top = minHeap.poll();
            int top2 = minHeap.poll();
            if(top!=top2) minHeap.offer(top-top2);
        }
        minHeap.offer(0);
        return Math.abs(minHeap.peek());
    }
}
