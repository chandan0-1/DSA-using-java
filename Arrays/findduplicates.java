public class Solution{  

    public static int findUnique(int[] arr){
        //Your code goes here
        for (int i=0;i<arr.length-1;i++){
            boolean flag=false;
            
            for (int j= i+1;j<arr.length; j++)
            {
                if (arr[i]==arr[j])
                	{
                    flag=true;
                    arr[j]=-100000;
                    break;
                	}
            }
            if (flag==false && arr[i]!=-100000){
                return arr[i];
            }
        }//
        return arr[arr.length-1];
   }
}

