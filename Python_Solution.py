from collections import Counter

class Solution:
    def canFormPalindrome(self, s: str) -> bool:
        char_counts = Counter(s)
        odd_count = sum(1 for count in char_counts.values() if count % 2 == 1)
        return odd_count <= 1
