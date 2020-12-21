import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Scanner;
public class Solution {
    public static boolean fun(boolean visited[], int[][] arr,int e,int v,int s,int t){
        if (s==t || arr[s][t]==1){
            return true;
        }
        
        visited[s] = true;
        for(int i=0;i<v;i++){
            if (arr[s][i] == 1 && visited[i] == false){
                if(fun(visited,arr,e,v,i,t)){
                    return true;
                }
            }
        }
        return false;


    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int arr[][] = new int[v+1][v+1];
        for (int i = 0;i<e;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;

        }
        int s = sc.nextInt();
        int t = sc.nextInt();

        boolean visited[] = new boolean[v];

        if (fun(visited,arr,e,v,s,t)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }



    }
}


