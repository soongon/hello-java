package kr.re.kitri.fi;

@FunctionalInterface
public interface NewInterface {

    public static final int A = 3;

    public abstract int add(int a, int b);

    default public int sub(int a, int b) {
        int result = div(a,b);
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    private int div(int a, int b) {
        return a / b;
    }
}


