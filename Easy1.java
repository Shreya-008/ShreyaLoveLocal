import java.util.*;

public class Easy1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        StringTokenizer st=new StringTokenizer(s);
        List<String>li=new ArrayList<>();
        while(st.hasMoreTokens()){
            li.add(st.nextToken());
        }
        System.out.println(li.get(li.size()-1).length());
    }
}