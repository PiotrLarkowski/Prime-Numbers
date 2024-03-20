import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeNumbersSearcher {
    Random rand = new Random();
    private int primeNumber = 7;
    private List<Integer> primeNumbersList = new ArrayList<>();
    boolean isPrimeNumber = true;
    public int primeNumberGenerator(int size){
        for (int i = 2;i<size; i++) {
            for(Integer number: primeNumbersList){
                if(i%number==0){
                    isPrimeNumber = false;
                    break;
                }else{
                    isPrimeNumber = true;
                }
            }
            if(isPrimeNumber){
                primeNumbersList.add(i);
            }
            isPrimeNumber = true;
        }
        int i = rand.nextInt(primeNumbersList.size());
        return primeNumbersList.get(i);

    }
}
