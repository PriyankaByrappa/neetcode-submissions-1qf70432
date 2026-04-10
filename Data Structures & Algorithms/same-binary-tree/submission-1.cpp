/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
        queue<TreeNode*> p1;
        queue<TreeNode*> p2;
        p1.push(p);
        p2.push(q);
        while(!p1.empty()&&!p2.empty())
        {
            for(int i=p1.size();i>0;i--)
            {
                TreeNode* nodeP=p1.front();p1.pop();
                TreeNode* nodeQ=p2.front();p2.pop();
                if(!nodeP && !nodeQ) continue;
                if(!nodeP || !nodeQ || nodeP->val != nodeQ->val)
                return false;

                p1.push(nodeP->left);
                p1.push(nodeP->right);
                p2.push(nodeQ->left);
                p2.push(nodeQ->right);
            }
        }
        return true;
    }
};
