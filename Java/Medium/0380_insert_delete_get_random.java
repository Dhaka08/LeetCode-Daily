class RandomizedSet {
    List<Integer> list;
    HashMap<Integer,Integer> mp;
    Random random = new Random();

    public RandomizedSet() {
        list = new ArrayList<>();
        mp = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(mp.containsKey(val)) return false;
        else{
            mp.put(val,list.size());
            list.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!mp.containsKey(val)) return false;
        int pos = mp.get(val);
        if(pos!=list.size()-1){
            int lastelement = list.get(list.size()-1);
            list.set(pos,lastelement);
            mp.put(lastelement,pos);
        }
        mp.remove(val);
        list.remove(list.size()-1);
        return true;
    }
    
    public int getRandom() {
        int randomInt = random.nextInt(list.size());
        return list.get(randomInt);
    }
}