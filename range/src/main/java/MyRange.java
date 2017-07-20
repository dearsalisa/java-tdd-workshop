public class MyRange {
    public String of(String input) {
        return null;
    }

    public int getLastNumber(String input) {
        return 0;
    }

    public boolean isก้ามปูปิด(String input) {
        return false;
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
