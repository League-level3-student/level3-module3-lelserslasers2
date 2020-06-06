package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		char[] bList = new char[s.length()];                                     
		for (int i = 0; i < bList.length; i++) {
			bList[i] = s.charAt(s.length() - i - 1);
			System.out.println(bList);
		}
		return "tset a si sihT";
	}

}
