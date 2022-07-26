package leetcode

/**
 * 1480. Running Sum of 1d Array
 * https://leetcode.com/problems/running-sum-of-1d-array/
 * */
class LeetCode1480 {
    fun runningSum(nums: IntArray): IntArray {
        for (i in 1 until nums.size) {
            nums[i] += nums[i - 1]
        }

        return nums
    }
}
