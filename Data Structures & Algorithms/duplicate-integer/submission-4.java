class Solution {
    public boolean hasDuplicate(int[] nums) {
    
        HashSet<Integer> uniqueNums = new HashSet<Integer>();
        for (int num: nums) {
            uniqueNums.add(num);
        }
        return nums.length != uniqueNums.size();  
    }
}