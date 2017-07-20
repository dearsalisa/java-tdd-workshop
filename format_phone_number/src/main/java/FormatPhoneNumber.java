public class FormatPhoneNumber {

    public String removeNonDigit(String input) {
        input = input.replace("-","");
        input = input.replace(" ","");
        return input;
    }

    public String solution(String input) {
        String result = "";
        for (int i = 1; i <= input.length(); i++) {
            result += input.charAt(i-1);
            if (i%3 == 0 && i != input.length()) {
                result += "-";
            }
        }
        return result;
    }

}
