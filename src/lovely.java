public class lovely {
    public int solution(int A, int B){
        // Start traversing the numbers
        for (int i=A ; i<=B ; i++)
        {
            int num = i;
            boolean visited[] = new boolean[10];
      
            // Find digits and maintain its hash
            while (num != 0)
            {
                // if a digit occurs more than 1 time
                // then break
                if (visited[num % 10])
                    break;
      
                visited[num%10] = true;
      
                num = num/10;
            }
      
            // num will be 0 only when above loop
            // doesn't get break that means the
            // number is unique so print it.
            if (num == 0)
                System.out.print(i + " ");
        }
    }
    public static void main(String[] args){
        Solution m = new Solution();
        System.out.println(m.solution(new int[]{1,3,6,4,1,2}));
        //System.out.println(m.solution(new int[]{1,2,3}));
        //System.out.println(m.solution(new int[]{-1,-3}));
    }
}
