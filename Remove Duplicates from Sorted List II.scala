object Solution {
    def deleteDuplicates(head: ListNode): ListNode = {
        if (head == null || head.next == null)  return head
        
        var dummy = new ListNode(-1)
        dummy.next = head
        var prev = dummy
        var p = head
        
        while (p != null && p.next != null)
        {
            if (p != null && p.next != null && p.x == p.next.x)
            {
                while (p != null && p.next != null && p.x == p.next.x)
                {
                    p = p.next;
                }
                prev.next = p.next
            }
            else
            {
                prev = p
            }
            p = p.next
        }
        return dummy.next        
    }
}
