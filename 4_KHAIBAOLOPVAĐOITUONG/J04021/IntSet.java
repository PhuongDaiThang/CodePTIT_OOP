package J04021;

import java.util.Set;
import java.util.TreeSet;

public class IntSet {
    private int[]a;
    public IntSet(int[]a){
        this.a=a;
    }
    public IntSet union(IntSet A)
    {
        Set<Integer> mySet = new TreeSet<>();
        for (int i : a)
            mySet.add(i);
        for (int i : A.a)
            mySet.add(i);
        return new IntSet(mySet.stream().mapToInt(Integer::intValue).toArray());
    }
    @Override
    public String toString() {
        String s="";
        for(int i:a)
            s+=Integer.toString(i)+" ";
        return s;
    }
}
