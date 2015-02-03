	void traverse(TreeNode *root,int level,vector <vector <int>> &result)
	{
		vector<vector <int>> result;

		if (level > result.size())
		{
			result.push_back(vector<int> ());
		}

		result[level-1].push_back(root->val);
		traverse(root->left,level+1,result);
		traverse(root->right,level+1,result);
		return result;	

	}

	vector<vector<int> > levelOrder(TreeNode *root) {
		vector <vector <int>> result;
		traverse(root,1,result);

		return result;
    }