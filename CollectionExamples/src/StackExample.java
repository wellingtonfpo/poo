void main() {
    Stack<Number> stack = new Stack<>();

    stack.push(12L);
    IO.println("Pushed 12L");
    printStack(stack);
    stack.push(34567);
    IO.println("Pushed 34567");
    printStack(stack);
    stack.push(1.0F);
    IO.println("Pushed 1.0F");
    printStack(stack);
    stack.push(3.14159);
    IO.println("Pushed 3.14159");
    printStack(stack);

    removeTop(stack);
    printStack(stack);
}

private void printStack(Stack<Number> stack) {
    if (stack.empty())
        IO.println("Stack is empty");
    else
        IO.println("Stack contains: " + stack + " -> (top)");
}

private void removeTop(Stack<Number> stack) {
    if (stack.empty())
        IO.println("Stack is empty");
    else {
        try {
            while (true) {
                Number removeObj = stack.pop();
                IO.println("Popped " + removeObj);
            }
        } catch (EmptyStackException e) {
            IO.println("Error: " + e.getMessage());
        }
    }
}