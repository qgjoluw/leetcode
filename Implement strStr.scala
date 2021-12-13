object Solution {
    def strStr(haystack: String, needle: String): Int = {
        if (haystack == null || needle == null) return -1
        return haystack.indexOf(needle)
    }
}
