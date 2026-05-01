class Solution {
    public boolean hasDuplicate(int[] nums) {
        // ArrayList<> storedNums = Arrays.asList(nums);
        // set has unique values only
        // specify type of set - don't use polymorphism for fastest and don't leave in system out println
        // specify in generics
        HashSet<Integer> uniqueNums = new HashSet<Integer>();
        // for (int num: nums) {
        //     uniqueNums.add(num);
        // }
        // return nums.length != uniqueNums.size();

        for (int num: nums) {
            if (uniqueNums.contains(num)) {
                // quit program as soon as there is duplicate - don't just scan at end
                return true;
            }
            uniqueNums.add(num);
        }  
        return false;
    }
    
    // time: O(n) since you're iterating over the array once
    // space: O(n) since you're creating a new HashSet of max n elements
    // sorting of array to identify duplications is also an option but it takes O(nlogn) time but O(1) space
    // HashSet is O(n) in both -> we can insert elements in HashSet in O(n) time for all of them but insertion eliminates duplicates
    // no checking with HashSets  
}