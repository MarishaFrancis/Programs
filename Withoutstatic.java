class Withoutstatic {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
 
    public void main(String args[])
    {
        int n = 9;
        System.out.println(fib(n));
    }
}