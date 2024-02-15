class Solution
{
    public:
    
    // Function to reverse first k elements of a queue.
    queue<int> modifyQueue(queue<int> q, int k) {
        int len = q.size();
        queue<int> res;
        stack<int> stk;
        for(int i=0;i<k;i++){
            stk.push(q.front());
            q.pop();
        }
        for(int i=0;i<k;i++){
            res.push(stk.top());
            stk.pop();
        }
        for(int i=0;i<len-k;i++){
            res.push(q.front());
            q.pop();
        }
        return res;
    }
};
