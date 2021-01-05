import java.util.Scanner;

public class Main {

    public static void stringCycle(String arr[],char e,char fnl,int[] a,boolean[] vis){

        for(int i = 0; i<arr.length; i++){
            if (arr[i].charAt(0) == e && !vis[i]){
                vis[i] = true;
                a[0]+=1;
                if (a[0]==arr.length){
                    if(arr[i].charAt(arr[i].length()-1) == fnl){
                        return;
                    }
                    else{
                        a[0]-=1;
                    }
                    
                }
                stringCycle(arr,arr[i].charAt(arr[i].length()-1),fnl,a,vis);
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i=0 ;i<n; i++){
            arr[i] = sc.next();
        }
        

        

        int cnt = 0;
        for (int i=0 ;i<n; i++){
            boolean vis[] = new boolean[n];
            int k = 0;
            int[] a = new int[1];

            stringCycle(arr, arr[i].charAt(arr[i].length()-1),arr[i].charAt(0) ,a,vis);
            
            if (a[0] == n){
                System.out.println(1);
                cnt = 1;
            	break;
            }

            }
        if (cnt==0){
            System.out.println(0);
        }


    }

}
