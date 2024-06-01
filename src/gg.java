public class gg {
    // Higher-Order 1: Function accepts a function as an argument
    private static int execute(Multiplier<Integer, Integer> multiplier){
    return multiplier.multiply(5, 10);
    }
    // Higher-Order 2: Function returns another function
    private static Multiplier<Integer, Integer> getMultiplier() {
    // First-Class 1: Function assigned to a variable
    Multiplier<Integer, Integer> multiplier = (a, b) -> a * b;
    // First-Class 3: Function returned from a function
    return multiplier;
    }
    public static void main(String[] args) {
        Multiplier<Integer, Integer> multiplier = getMultiplier();
// First-Class 2: Function passed as an argument
int ans = execute(multiplier);
System.out.println(ans);
}
}