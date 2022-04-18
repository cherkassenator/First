package Chapter2HW;

public class PrimeNumber {
  private int numbers;
  private int i, j;
  private boolean isprime;

    public void Prime(){
        for (i = 2; i <= numbers; i++){
            isprime =true;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    isprime = false;
                }
            }
            if (isprime) System.out.println(i);
        }
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }
}
