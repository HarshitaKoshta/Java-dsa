class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            
            // convert number to string
            String s = String.valueOf(num);

            // add each digit into list
            for (char ch : s.toCharArray()) {
                list.add(ch - '0');
            }
        }

        // convert list to array
        int[] ans = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}