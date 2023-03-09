Question link - https://leetcode.com/problems/3sum-closest/description/

class Solution {
	public int threeSumClosest(int[] nums, int t) {
		if (nums.length < 44)
			java.util.Arrays.sort(nums);
		else {
			byte[] a = new byte[2001];
			for (int v : nums)
				a[v + 1000]++;
			for (int z = 0, c = 0; z < 2001; ++z) {
				int w = a[z];
				while (w-- != 0)
					nums[c++] = z - 1000;
			}
		}

		int i = 0, n = nums.length - 1;


		for (int min = t - nums[n - 1] - nums[n], end = n - 2; i < end && nums[i] <= min; ++i) {}

		for (int max = t - nums[i] - nums[i + 1], end = i + 2; n > end && nums[n] >= max; --n) {}

		int minAbs = 0x7fffffff, minSum = 0;
		for (int end = n - 1; i < end; ++i) {
			int num_i = nums[i];

			for (int j = i + 1, k = n; j < k;) {
				int sum = num_i + nums[j] + nums[k];
				if (sum == t)
					return sum;

				int abs;
				if (sum > t) {
					abs = sum - t;
					k--;
				} else {
					abs = t - sum;
					j++;
				}
				if (abs < minAbs) {
					minAbs = abs;
					minSum = sum;
				}
			}
		}
		return minSum;
	}
}
