//217. Contains Duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Solution 1: Time O(n2) : Space O(1)

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i] == nums[j]) return true;
        //     }
        // }
        // return false;

        // Solution 2: Time O(nlogn) : Space O(1)

        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i] == nums[i+1]) return true;
        // }
        // return false;

        // Solution 3: Time O(n) : Space O(n)

        Set<Integer> num_set = new HashSet<Integer>();
        for(int num: nums){
            // set.add returns false if element is present
           if(num_set.contains(num)) return true;
           num_set.add(num);
        }
        return false;
    }
}
