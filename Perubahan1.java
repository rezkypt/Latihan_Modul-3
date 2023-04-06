public class Perubahan1 {
    static class Stack {
        int top = -1;
        String[] arr = new String[100];

        void push(String value) {
            arr[++top] = value;
        }

        String pop() {
            if (top < 0) {
                return null;
            }
            String value = arr[top];
            arr[top--] = null;
            return value;
        }

        String peek() {
            if (top < 0) {
                return null;
            }
            return arr[top];
        }

        boolean empty() {
            return top == -1;
        }

        int search(String value) {
            for (int i = top; i >= 0; i--) {
                if (arr[i].equals(value)) {
                    return top - i + 1;
                }
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Stack at = new Stack();

        at.push("Aku");
        at.push("Anak");
        at.push("Indonesia");

        System.out.println("Next : " + at.peek());
        at.push("Raya");
        System.out.println(at.pop());
        at.push("!");

        int count = at.search("Aku");
        while (count != -1 && count > 1) {
            at.pop();
            count--;
        }
        System.out.println(at.pop());
        System.out.println(at.empty());
    }
}