void main() {
    try {
        method1();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

void method1() throws Exception {
    try {
        method2();
    } catch (Exception e) {
        throw new Exception("Exception in method1", e);
    }
}

void method2() throws Exception {
    try {
        method3();
    } catch (Exception e) {
        throw new Exception("Exception in method2", e);
    }
}

void method3() throws Exception {
    throw new Exception("Exception in method3");
}