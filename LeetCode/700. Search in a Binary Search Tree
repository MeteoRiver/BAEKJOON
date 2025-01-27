class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        // 노드가 없거나 찾는 값과 현재 노드 값이 일치하면 반환
        if (root == null || root.val == val) {
            return root;
        }
        // 찾는 값이 현재 노드보다 작으면 왼쪽 서브트리 탐색
        if (val < root.val) {
            return searchBST(root.left, val);
        }
        // 찾는 값이 현재 노드보다 크면 오른쪽 서브트리 탐색
        return searchBST(root.right, val);
    }
}
