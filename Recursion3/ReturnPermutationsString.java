public class solution {
	
	public static String[] permutationOfString(String s){
		if (s.length()==0){
            String[] output={""};
            return output;
        }
        
        String[] smalloutput = permutationOfString(s.substring(1));
        String output[] = new String[s.length()*smalloutput.length];
        // System.out.println(input.length()*smallerOutput.length);

		int k =0;
		for(int i = 0; i < smalloutput.length; i++){
			String currentString = smalloutput[i];
			for(int j = 0; j <= currentString.length(); j++){		
				output[k] = currentString.substring(0, j) + s.charAt(0) + currentString.substring(j);
				k++;
			}
		}
		return output;
        
		
	}
	
}
