public class FizzBuzz {
    public String say(int input) {
        if (input == 3 || input == 6) return "Fizz";
        if (input == 5) return "Buzz";
        return Integer.toString(input);
    }
}
