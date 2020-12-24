import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Scanner;
public class Solution {
    public static void fun(boolean visited[], int[][] arr,int e,int v,int j){


        Queue<Integer> q = new LinkedList<>();
        q.add(j);
        while (!q.isEmpty()){
            int val = q.poll();
            visited[val] = true;
            System.out.print(val+" ");

            for(int i =0;i<arr[0].length;i++){
                if (arr[val][i] ==1 && visited[i]==false){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }


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

        boolean visited[] = new boolean[v];

        for(int j =0;j<v;j++){
            if (visited[j]==false){
                fun(visited,arr,e,v,j);
            }
        }


    }

}


