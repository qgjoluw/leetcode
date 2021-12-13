object Solution {
    def isPalindrome(x: Int): Boolean = {
        if (x < 0 ) return false
        
        var s = x.toString
        return s == s.reverse
    }
}
