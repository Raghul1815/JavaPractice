class Solution {
    public double average(int[] nums) {
        int sum = 0;

        for(int num : nums) {
            sum += num;
        }

        return (double) sum / nums.length;
    }
}
