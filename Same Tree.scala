object Solution {
    def isSameTree(p: TreeNode, q: TreeNode): Boolean = {
        if (p == null && q == null) return true
        else if (p == null || q == null)    return false
        
        if (p.value == q.value)
        {
            return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right))
        }
        else 
        {
            return false
        }
    }
}
