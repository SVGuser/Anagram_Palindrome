class Solution {
  public:
    bool canFormPalindrome(string &s) {
        unordered_map<char, int> frq;
        for (char c : s) {
            frq[c]++;
        }
        int odd = 0;
        for (auto &O : frq) {
            if(O.second % 2 != 0) {
                odd++;
            }
        }
        return odd <= 1;
    }
};
