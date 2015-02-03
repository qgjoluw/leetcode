	//notice: input parameter result should be revised.
	void traverse(TreeNode *root,int level,vector <vector <int>> &result)
	{
	    if (!root) return;
		//???
		if (level > result.size())
		{
			result.push_back(vector<int> ());
		}

        //root level is 1-1 =0;
		result[level-1].push_back(root->val);
		//left/right level is 1+1-1 = 1;
		traverse(root->left,level+1,result);
		traverse(root->right,level+1,result);
	}

	vector<vector<int> > levelOrderBottom(TreeNode *root) {
	    
		vector <vector <int>> result;
		traverse(root,1,result);
		reverse(result.begin(),result.end());
		return result;
    }