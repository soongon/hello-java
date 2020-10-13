package kr.re.kitri.fi;

public class FIDemo {

    public static int calc(NewInterface ni, int a, int b) {
        return ni.add(a, b);
    }

    public static void main(String[] args) {
        int result = calc((a, b) -> a + b, 3, 4);
        System.out.println(result);
    }
}
