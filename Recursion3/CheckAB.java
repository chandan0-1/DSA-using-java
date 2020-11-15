public class Solution {

    public static boolean checkAB(String s) {
        if (s.length()==0){
            return true;
        }
        if (s.charAt(0)=='a'){
            if(s.length()>2 && s.substring(1,3).equals("bb")){
                return checkAB(s.substring(3));
            }
            else{
                return checkAB(s.substring(1));
            }
        }
        else{
            return false;
        }

        // return true;

    }
}

