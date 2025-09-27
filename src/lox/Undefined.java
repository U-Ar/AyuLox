package lox;

public class Undefined {
    private static final Undefined undefined = new Undefined();
    private Undefined() {

    }
    static Undefined getUndefined() {
        return undefined;
    }
}
