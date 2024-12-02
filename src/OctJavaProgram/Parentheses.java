package OctJavaProgram;

public class Parentheses {

	public static void main(String[] args) {

		String s = "{}";

		System.out.println(isValidParentheses(s));
	}

	public static boolean isValidParentheses (String s) {
			
			while(true) {
				if (s.contains("()")){
					s = s.replace("()", "");
				}
				else if (s.contains("{}")) {
					s=s.replace("{}","");
				}
				else if (s.contains("[]")) {
					s=s.replace("[]", "");
				}
				else {
					return s.isEmpty();
				}
			}
		}
}
