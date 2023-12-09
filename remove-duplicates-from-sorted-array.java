class Solution {
    public int removeDuplicates(int[] nums) {
            int uniuqeCount = 0;
            int pointer = 1;
            for(int i = 0; i < nums.length -1 ; i++) {
                if(nums[i] == nums[i+1]) {
                    uniuqeCount++;
                } else {
                    nums[pointer] = nums[i+1];
                    pointer++;
                }

            }

            return nums.length - uniuqeCount;
    }
}
