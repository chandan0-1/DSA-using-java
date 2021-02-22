
public class Solution {

	public static int countWords(String str){
        int c=0;
        c++;

        for (int i=0 ; i<str.length();i++){
            if (str.charAt(i)==' '){
                c++;
            }
        }
        return c;
	}
}

