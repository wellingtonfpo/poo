void main() {
    try {
        throwException();
    } catch (Exception e) {
        System.err.println("Exception handled in main.");
    }

    doesNotThrowException();
}

public void throwException() throws Exception {
    try {
        System.out.println("Method throwException()");
        throw new Exception();
    } catch (Exception e) {
        System.err.println("Exception handled in method throwException()");
        throw e; // Rethrow the exception to be handled in main
    } finally {
        System.out.println("Finally executed in method throwException()");
    }
}

public void doesNotThrowException() {
    try {
        System.out.println("Method doesNotThrowException()");
    } catch (Exception e) {
        System.err.println("Exception handled in method doesNotThrowException()");
    } finally {
        System.out.println("Finally executed in method doesNotThrowException()");
    }
}
