object Solution {
    def lengthOfLastWord(s: String): Int = {
        if (s.length ==0)   return 0
        
        var s1:Array[String] = s.split(" ")
        var len = s1.length - 1
        return s1(len).toString.length
    }
}
