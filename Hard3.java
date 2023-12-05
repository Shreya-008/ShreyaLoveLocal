import java.util.*;

public class Hard3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        for(int i=0;i<=n;i++){
            int m=i;
            while(m>0){
                int tp=m%10;
                if(tp==1)
                    ans++;
                m/=10;
            }
        }
        System.out.println(ans);
    }
}