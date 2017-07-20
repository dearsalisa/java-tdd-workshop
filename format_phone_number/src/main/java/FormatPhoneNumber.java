public class FormatPhoneNumber {

    public String removeNonDigit(String input) {
        input = input.replace("-","");
        input = input.replace(" ","");
        return input;
    }

    public String solution(String input) {
        String result = "";
        input = removeNonDigit(input);
        for (int i = 1; i <= input.length(); i++) {
            result += input.charAt(i-1);
            if (i%3 == 0 && i != input.length()) {
                result += "-";
            }
            if (i+4 == input.length() && input.length()%3 == 1) {
                result += input.substring(i, i+2)+"-"+input.substring(i+2, i+4);
                break;
            }
        }
        return result;
    }
}
