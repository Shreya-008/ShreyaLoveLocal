import java.util.*;

public class Medium2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(a[i],mp.getOrDefault(a[i],0)+1);
        }
        List<Integer>ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            if(entry.getValue()>n/3)
                ans.add(entry.getKey());
        }
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}