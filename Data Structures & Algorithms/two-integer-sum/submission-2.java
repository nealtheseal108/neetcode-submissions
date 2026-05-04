class Solution {
    public int[] twoSum(int[] nums, int target) {
        // O(n^2) solution
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return null;
        
        HashMap<Integer, Integer> numIndexMap = new HashMap<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            numIndexMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (numIndexMap.get(target - num) != null) {
                if (target - num == num) {
                    for (int j = numIndexMap.get(target - num) + 1; j < nums.length; j++) {
                        if (nums[j] == num) {
                            return new int[]{numIndexMap.get(target - num), j};
                        }
                    }
                } else {
                    if (i < numIndexMap.get(target - num)) {
                        return new int[]{i, numIndexMap.get(target - num)};
                    }
                    return new int[]{numIndexMap.get(target - num), i};
                }
            }
        }
        return null;
    }

    // target - 1 = j
    // using hashmap, we can map each value in array to its index

}



