public class Factorial {

    public Factorial() {

    }

    public long factorial(long num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
