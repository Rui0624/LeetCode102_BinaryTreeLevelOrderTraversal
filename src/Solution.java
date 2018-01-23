import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

//Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null)
        	return res;
        
        q.add(root);
        while(q.isEmpty() == false){
        	List<Integer> level = new ArrayList<Integer>();
        	int m = q.size();
        	for(int i = 0; i < m; i++){
        		TreeNode node = q.peek();
        		level.add(node.val);
        		q.remove();
        		if(node.left != null)
        			q.add(node.left);
        		if(node.right != null)
        			q.add(node.right);
        	}
        	res.add(level);
        	level.clear();
        	
        }
        
        return res;
    }
	
}
