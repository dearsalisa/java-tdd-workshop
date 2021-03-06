public class MyRange {
    public String of(String input) {
        String result ="";
        int first = getFirstNumber(input);
        int last = getLastNumber(input);
        for (int i = first; i <= last; i++) {
            result += i;
        }
        return result;
    }

    public int getLastNumber(String input) {
        int last = Character.getNumericValue(input.charAt(3));
        if(isก้ามปูปิด(input)){
            return last;
        }
        return last-1;
    }

    public boolean isก้ามปูปิด(String input) {
        return input.endsWith("]");
    }

    public int getFirstNumber(String input) {
        int first = Character.getNumericValue(input.charAt(1));
        if(isก้ามปูเปิด(input)){
            return first;
        }
        return first+1;
    }

    public boolean isก้ามปูเปิด(String input) {
        return input.startsWith("[");
    }
}
