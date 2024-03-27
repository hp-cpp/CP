class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()  # Sort the people array
        boats = 0
        left = 0
        right = len(people) - 1

        while left <= right:
            if people[left] + people[right] <= limit:
                left += 1
            right -= 1
            boats += 1

        return boats