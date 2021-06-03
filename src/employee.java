import java.util.ArrayList;
public class employee {
    public static int solution(String s){
        int counterB=0;
        StringBuilder sb = new StringBuilder(s);
        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();
        ArrayList<Integer> arrO = new ArrayList<>();
        ArrayList<Integer> arrL = new ArrayList<>();
        ArrayList<Integer> arrN = new ArrayList<>();
        for(int i = 0; i <s.length(); i++){
            if(s.charAt(i) == 'B'){
                int first = i;
                arrB.add(first);
                counterB++;
            }
        }
        return 0;
    }
}
