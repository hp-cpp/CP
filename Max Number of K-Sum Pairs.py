class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        num_counts = {}
        operations = 0

        for num in nums:
            complement = k - num
            if complement in num_counts and num_counts[complement] > 0:
                operations += 1
                num_counts[complement] -= 1
            else:
                num_counts[num] = num_counts.get(num, 0) + 1

        return operations
