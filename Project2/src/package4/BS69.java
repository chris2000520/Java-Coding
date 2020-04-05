package package4;

public class BS69 {
    public static void main(String[] args) {
        int num=100;
        System.out.println(Mysqrt(num));

    }

    public static int Mysqrt(int num){
        long l=0,h=num;
        while (l<=h){
            long mid=(l+h)/2;
            if (mid*mid>num){
                h=mid-1;
            }
            if (mid*mid<num){
                l=mid+1;
            }
            if (mid*mid==num){
                return (int)mid;
            }
        }
        return (int)h;
    }
}
