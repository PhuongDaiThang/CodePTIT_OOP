package J04020;

public class Pair<S, T>
{
    private T first;
    private S second;

    public Pair(T first, S second)
    {
        this.first = first;
        this.second = second;
    }
    public boolean isPrime(){
        return isPrimeNumber((Integer)this.first) && isPrimeNumber((Integer)this.second);
    }
    private boolean isPrimeNumber(int n){
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    @Override
    public String toString(){
        return this.first + " " + this.second;
    }
}
