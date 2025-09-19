package vn.dataguard.stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Character> myStack = new ArrayStack<>(); // contents: ()
        String open = "{[(";
        String close = "}])";

        String test = "{[({[(]})]}";

        for (int i = 0; i < test.length(); i++) {
            char c = test.charAt(i);
            if (open.indexOf(c) >= 0) {
                myStack.push(c);
            } else  {
                if (myStack.isEmpty()) {
                    System.out.println("Khong khop");
                    return;
                } else {
                    char temp = myStack.pop();
                    if (close.indexOf(c) != open.indexOf(temp)) {
                        System.out.println("Khong khop");
                        return;
                    }
                }
            }
        }
        System.out.println("Rat la khop");
    }
}
