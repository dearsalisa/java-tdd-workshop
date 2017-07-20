import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List result = new ArrayList();
        if(number > 1) result.add(number);
        return result;
    }
}
