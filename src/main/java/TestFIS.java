import java.util.Stack;

public class TestFIS {

    private TestFIS() {
        System.out.println("Private Constur");
    }

    public void get() {
        TestFIS tf = new TestFIS();
    }

    public static void main(String[] args) {

    }


    public final String openParenthesis = "(";
    public final String closeParenthesis = ")";

    public String reverse(String str) {
        Stack<String> stack = new Stack();
        String[] strArr = str.split(" ");
        String result = "";
        for (String s : strArr) {
            if ("++".equals(s)) {
                if (!stack.empty()) {
                    result = stack.pop();
                    result = addBracket(result.concat(s));
                    stack.push(result);
                }
            }
            if ("+".equals(s)) {
                if (!stack.empty()) {
                    String s1 = stack.pop();
                    String s2 = stack.pop();
                    result = s2 + s + s1;
                    stack.push(addBracket(result));
                }
            }
            if ("-".equals(s)) {
                if (!stack.empty()) {
                    String s1 = stack.pop();
                    String s2 = stack.pop();
                    result = s2 + s + s1;
                    stack.push(addBracket(result));
                }
            }
            if (s.matches("[0-9]")) {
                stack.push(s);
            }
        }
        if (!stack.empty())
            result = stack.pop();
        return result;
    }

    public String addBracket(String result) {
        return openParenthesis + result + closeParenthesis;
    }
}
