import java.util.*;

public class Main {

    public static int helper(int[] arr){
        int n = arr.length;
        int[] rb = new int[n];
        rb[n-1] = n;
        Stack<Integer> st1 = new Stack<>();
        st1.push(n-1);
        for (int i = n-2; i >= 0; i--){
            while (st1.size() > 0 && arr[st1.peek()] >= arr[i]){
                st1.pop();
            }

            if (st1.size() == 0){
                rb[i] = n;
            }
            else{
                rb[i] = st1.peek();
            }

            st1.push(i);
        }

        int[] lb = new int[n];
        lb[0] = -1;

        Stack<Integer> st2 = new Stack<>();
        st2.push(0);

        for (int i = 1; i < n; i++){
            while (st2.size() > 0 && arr[st2.peek()] >= arr[i]){
                st2.pop();
            }

            if (st2.size() == 0){
                lb[i] = -1;
            }
            else{
                lb[i] = st2.peek();
            }
            st2.push(i);
        }


        int area = 0;
        for (int i = 0; i< n; i++){
            int temp;
            if (arr[i] == 0){
                temp = 0;
            	}
            else{
                temp = (arr[i]+(rb[i] - lb[i]-1 ))* 2;
            	}
            if (temp > area){
                area = temp;
            }
        }
        return area;





    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] arr = new char[n][m];

        for (int i = 0; i < n; i++){

            char[] temp = new char[m];
            String s = sc.next();
            for (int j = 0 ; j < m; j++){
                temp[j] = s.charAt(j);
            }
            arr[i] = temp;
        }

        // XXXXXXX.XX
        // [0,0,]
        int[] temparr = new int[m];
        for (int i = 0; i < m; i++){
            if (arr[0][i] == 'X'){
                temparr[i] = 0;
            }
            else{
                temparr[i] = 1;
            }
        }


        int maxarea = 0;
        if (n >0 && m > 0){
            maxarea = helper(temparr);
            for (int row = 1; row < n; row++){
                for (int j = 0; j < m;j++){
                    if (arr[row][j] == 'X' ){
                        temparr[j] = 0;

                    }
                    else{
                        temparr[j] += 1;
                    }
                }

                int tmparea = helper(temparr);
                if ( tmparea > maxarea){
                    maxarea = tmparea;
                }
            }
        }
        System.out.println(maxarea-1);

    }

}
