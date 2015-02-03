    vector<int> postorderTraversal(TreeNode *root) {
		vector<int> result;
		stack<TreeNode *> st;
		TreeNode *p = root;

		while (p)
		{
			//1. push root into stack;
			st.push(p);


			if (p->left)
			{
				//2. push left child into stack;
				p = p->left;
			}
			else if (p->right)
			{
				//4. push right child into stack;
				p = p->right;
			}
			else
			{
				//5. visit left child.
				st.pop();
				result.push_back(p->val);
				while (!st.empty())
				{
					if (st.top()->right ==p || 
						st.top()->right ==NULL)
					{
						//6. if visited right child,visit root.
						result.push_back(st.top()->val);	
						st.pop();												
					}
					else
					{
					
						p = st.top()->right;
						break;
					}
				}
		
			}
		}

		return child;
    }