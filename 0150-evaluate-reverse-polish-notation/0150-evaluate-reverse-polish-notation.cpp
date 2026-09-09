class Solution {
public:
    int evalRPN(std::vector<std::string>& tokens) {
        std::stack<int> st;
        std::unordered_set<std::string> ops = {"+", "-", "*", "/"};
        
        for (const std::string& token : tokens) {
            if (ops.count(token)) {
               
                int b = st.top(); st.pop();
                int a = st.top(); st.pop();
                
                
                if (token == "+") st.push(a + b);
                else if (token == "-") st.push(a - b);
                else if (token == "*") st.push(a * b);
                else if (token == "/") st.push(a / b); 
            } else {
                
                st.push(std::stoi(token));
            }
        }
        
        return st.top();
    }
};
