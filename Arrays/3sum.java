class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplet = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i])
                continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                if (nums[j] + nums[k] > -nums[i]) k--;
                else if (nums[j] + nums[k] < -nums[i]) j++;
                else {
                    triplet.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j + 1] == nums[j]) j++;
                    while (j < k && nums[k - 1] == nums[k]) k--;
                    j++;
                    k--;
                }
            }
        }
        return triplet;
    }
}
