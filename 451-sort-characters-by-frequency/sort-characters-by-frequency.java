class Solution {
    public String frequencySort(String s) {
        
        // Step 1: Count frequency
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Create Max Heap (Priority Queue)
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        pq.addAll(map.keySet());

        // Step 3: Build result
        StringBuilder result = new StringBuilder();

        while(!pq.isEmpty()){
            char ch = pq.poll();
            int freq = map.get(ch);

            while(freq-- > 0){
                result.append(ch);
            }
        }

        return result.toString();
    }
}