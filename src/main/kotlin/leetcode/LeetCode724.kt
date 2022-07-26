package leetcode

/**
 * 724. Find Pivot Index
 * https://leetcode.com/problems/find-pivot-index/
 * */
class LeetCode724 {
    fun pivotIndex(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return -1
        }

        if (nums.size == 1) {
            return 0
        }

        var found = false
        var curr = 0
        var left = 0
        var right = nums.sum() - nums.first()

        val len = nums.size

        for (num in nums) {
            if (left == right) {
                found = true
                break
            }

            if (curr == len - 1) {
                break
            }

            left += num
            right -= nums[(curr++) + 1]
        }

        return if (found) curr else -1
    }
}
