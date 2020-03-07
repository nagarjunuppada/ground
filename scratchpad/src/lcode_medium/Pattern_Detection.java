package lcode_medium;

import java.util.HashMap;

/*given a string and array of strings find weather string repetetion
 *  in a array maintains sequence or not
 * */
public class Pattern_Detection {
	String patterns = "aaaa";
	String sequencStrings = "dog dog dog dog";
	String[] tempSequenceHolder = sequencStrings.split(" ");
	boolean result = true;

	public boolean sequenceDetectore() {
		HashMap hmp = new HashMap();
		
		for (int i = 0; i < patterns.length(); i++) {
			/*hmp.put('a',"caterpiller");
			System.out.println(hmp.get(patterns.charAt(i)));
			System.out.println(tempSequenceHolder[i]);*/
			if (hmp.containsKey(patterns.charAt(i))) {
				if (!(hmp.get(patterns.charAt(i)).equals(tempSequenceHolder[i]))) {
					result = false;
					return result;

				}
			}

				else {
					hmp.put(patterns.charAt(i), tempSequenceHolder[i]);

				}

			

		}

		return result;

	}
public static void main(String[] args) {
	Pattern_Detection pd= new Pattern_Detection();
	System.out.println(pd.sequenceDetectore());
}
}
