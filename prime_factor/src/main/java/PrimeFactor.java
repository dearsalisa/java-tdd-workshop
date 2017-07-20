import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List result = new ArrayList();
        while (number%2 == 0) {
            result.add(2);
            number /= 2;
        }
        if(number%3 == 0) {
            result.add(3);
            number /= 3;
        }
        if(number > 1) result.add(number);
        return result;
    }
}
