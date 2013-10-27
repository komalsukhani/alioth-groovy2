package s2gx;

public class FibJava {
    final Ctx ctx = new Ctx();

    void foo() {
        ctx.a = "1";
    }

    public int fib(int n) {
        return n<2?1:fib(n-2)+fib(n-1);
    }
}
