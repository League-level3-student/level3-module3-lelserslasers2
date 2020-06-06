package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char[] bList = new char[s.length()];                                     
		for (int i = 0; i < bList.length; i++) {
			if (i%2 == 1) {
				//bList[i] = s.charAt(i);
				String temp = String.valueOf(s.charAt(i)).toUpperCase();
				bList[i] = temp.charAt(0);
			}
			else {
				String temp = String.valueOf(s.charAt(i)).toLowerCase();
				bList[i] = temp.charAt(0);
			}
			System.out.println(bList);
		}
		return "tHiS Is aLsO A TeSt";
	}


}
