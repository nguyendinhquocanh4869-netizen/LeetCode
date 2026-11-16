class Solution {
    public boolean isValid(String s) {
        String a[] = s.split("");
        Stack<String> stack = new Stack<>();
        for(int i=0; i<a.length; i++){
            String c = a[i];
            if(c.equals("(") || c.equals("[") || c.equals("{")){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
            String top = stack.pop();
            if(c.equals(")") && !top.equals("(")){
                return false;
            }
            if(c.equals("]") && !top.equals("[")){
                return false;
            }
            if(c.equals("}") && !top.equals("{")){
                return false;
            }
        } 
        }
                return stack.isEmpty();
    }
}