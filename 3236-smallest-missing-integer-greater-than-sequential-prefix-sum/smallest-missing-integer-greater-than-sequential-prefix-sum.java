class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];

        // Find sequential prefix
        int i = 1;
        while (i < nums.length && nums[i] == nums[i - 1] + 1) {
            sum += nums[i];
            i++;
        }

        // Check if sum exists in the array
        while (contains(nums, sum)) {
            sum++;
        }

        return sum;
    }

    private boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}