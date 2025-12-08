class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0) return new ArrayList<>();
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> res = new ArrayList<>();
        backtrack(0,digits,new StringBuilder(),map,res);
        return res;
    }
    public void backtrack(int index,String digits,StringBuilder path,String[] map,List<String> res){
        if(index == digits.length()){
            res.add(path.toString());
            return;
        }
        String letters = map[digits.charAt(index)-'0'];
        for(char ch : letters.toCharArray()){
            path.append(ch);
            backtrack(index+1,digits,path,map,res);
            path.deleteCharAt(path.length()-1);
        }
    }
}