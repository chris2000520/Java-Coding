package package4;

public class BS34 {
    public static int searchInsert(int[] nums, int target) {
        int l=0,h=nums.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if (target<nums[mid]){
                h=mid-1;
            }
            if (target>nums[mid]){
                l=mid+1;
            }
            if (target==nums[mid])
                return mid;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums={2,3,5,6,7,8};
        int target1=4;
        int target2=8;
        System.out.println(searchInsert(nums,target2));
    }
}

