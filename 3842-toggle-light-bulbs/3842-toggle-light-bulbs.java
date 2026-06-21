class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        for(int x :bulbs){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        for(int x:mp.keySet()){
            if(((mp.get(x))%2)!=0){
                li.add(x);
            }
        }
        Collections.sort(li);
        return li;
    }
}