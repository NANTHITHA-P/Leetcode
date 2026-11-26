class Solution {
    public boolean play(int n,int remove){
        if(n<remove) return false;
        return !play(n-remove,remove-1);
    }
    public boolean canAliceWin(int n) {
        return play(n,10);
    }
}