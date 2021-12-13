object Solution {
    def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
        if (head == null )  return head
        
        val dummy = new ListNode(-1)
        dummy.next = head
        var len = 0
        var p = head
        var prev = dummy
        while (p != null)
        {
            len = len + 1
            p = p.next
        }
        
        if (n > len)    return head
        var cnt = 0
        p = head
        while (p != null && cnt < len -n)
        {
            prev = p
            p = p.next
            cnt = cnt + 1            
        }
        prev.next = p.next
        return dummy.next
    }
}
