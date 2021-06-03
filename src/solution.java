import java.util.*;
class Solution{
    
    public int solution(int[] A){
        /*
        HashSet<Integer> numeros = new HashSet<Integer>();
        for(int i = 1; i<=A.length;i++){
            numeros.add(i);
        }
        for(int a:A){
            numeros.remove(new Integer(a));
        }
        return numeros.iterator().next();
        */
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i : A) {
            if (map.get(new Integer(i))==null) {
                map.put(new Integer(i), 1);
            } else {
                map.put(new Integer(i), map.get(new Integer(i))+1);
            }
        }
        int c = 1;
        while (map.get(new Integer(c)) != null) {
            c++;
        }
        return c;
    }
    public static void main(String[] args){
        Solution m = new Solution();
        System.out.println(m.solution(new int[]{1,3,6,4,1,2}));
        //System.out.println(m.solution(new int[]{1,2,3}));
        //System.out.println(m.solution(new int[]{-1,-3}));
    }
}