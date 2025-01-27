class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true; // 빈 트리는 대칭
        return isMirror(root.left, root.right);
    }
    
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true; // 둘 다 null이면 대칭
        if (t1 == null || t2 == null) return false; // 하나만 null이면 대칭 X
        if (t1.val != t2.val) return false; // 값이 다르면 대칭 X
        
        // 왼쪽 서브트리의 왼쪽 자식과 오른쪽 서브트리의 오른쪽 자식을 비교
        // 왼쪽 서브트리의 오른쪽 자식과 오른쪽 서브트리의 왼쪽 자식을 비교
        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}
