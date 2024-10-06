package J07009;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class IntSet {
    private int[]a;
    public IntSet(int[]a){
        this.a=a;
    }
    public IntSet intersection(IntSet A) {
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        for (int i : this.a) {
            set1.add(i);
        }
        for (int i : A.a) {
            set2.add(i);
        }
        set1.retainAll(set2);
        int[] resultArray = new int[set1.size()];
        int index = 0;
        for (int i : set1) {
            resultArray[index++] = i;
        }
        return new IntSet(resultArray);
    }
    @Override
    public String toString() {
        String s="";
        for(int i:a)
            s+=Integer.toString(i)+" ";
        return s;
    }
}
