package package4;

public class BS167 {
    public static int[] twoSum(int[] numbers, int target) {
        int right=1,left=numbers.length;
        while(right<left){
            int sum=numbers[right]+numbers[left];
            if (sum>target){
                left--;
            }
            else if (sum<target){
                right++;
            }
            else{
                return new int[]{right,left};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[]num={1,4,5,6,7};
        int a=9;
        System.out.println(twoSum(num,a));
    }
}
