class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        for i in range(k):
            remove=nums.pop()
            nums.insert(0,remove)
