class PostFixEvaluate{
    public static void main(String[] args) {

        String[] tokens = {"2","1","+","3","*"};

        int[] stack = new int[tokens.length];
        int top = -1;

        for (String token : tokens) {

            if (token.equals("+") || token.equals("-") || 
                token.equals("*") || token.equals("/")) {

                int b = stack[top--];
                int a = stack[top--];

                int result = 0;

                switch (token) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/": result = a / b; break;
                }
                top++;
                stack[top] = result;

            } else {
                top++;
                stack[top] = Integer.parseInt(token);
            }
        }

        System.out.println("Output = " + stack[top]);
    }
}
