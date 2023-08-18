public class Prog1 {
	
	public static void main(String[] args) {
		Prog1 res1 = encodeThreeStrings("John", "Johny", "Janardhan");
		System.out.println(res1.output1 + "," + res1.output2 + "," + res1.output3);
	}
	public final String output1;
	public final String output2;
	public final String output3;

	public Prog1(String out1, String out2, String out3) {
		output1 = out1;
		output2 = out2;
		output3 = out3;
	}

	public static Prog1 encodeThreeStrings(String input1, String input2, String input3) {
		String[] str1 = divideString(input1);
		String[] str2 = divideString(input2);
		String[] str3 = divideString(input3);
		String in1 = str1[0] + str2[1] + str3[2];
		String in2 = str1[1] + str2[2] + str3[0];
		String in3 = str1[2] + str2[0] + str3[1];
		String fstr = toggleString(in3);
		System.out.println();
		Prog1 res = new Prog1(in1, in2, fstr);
		return res;
	}

	public static String[] divideString(String input) {
		int rem = input.length() % 3;
		int div = input.length() / 3;
		String first = null;
		String middle = null;
		String last = null;
		if (rem == 1) {
			first = input.substring(0, div);
			middle = input.substring(first.length(), first.length() + div + rem);
			last = input.substring(first.length() + middle.length(), input.length());
		}
		if (rem == 2) {
			first = input.substring(0, div + 1);
			middle = input.substring(first.length(), first.length() + div);
			last = input.substring(first.length() + middle.length(), input.length());
		}
		if (rem == 0) {
			first = input.substring(0, div);
			middle = input.substring(first.length(), first.length() + div);
			last = input.substring(first.length() + middle.length(), input.length());
		}
		return new String[] { first, middle, last };
	}

	public static String toggleString(String str) {
		char[] ch = str.toCharArray();
		String s = "";
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLowerCase(ch[i])) {
				s = s + Character.toUpperCase(ch[i]);
			}
			if (Character.isUpperCase(ch[i])) {
				s = s + Character.toLowerCase(ch[i]);
			}
		}
		return s;
	}
}