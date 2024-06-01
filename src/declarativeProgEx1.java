import java.util.Arrays;
public class declarativeProgEx1 {
public static void main(String[] args) {
int[] array = new int[] {1, 2, 3, 4, 5};
int[] evenArray = Arrays.stream(array)
.filter(a -> a % 2 == 0)
.toArray();
System.out.println(Arrays.toString(evenArray));
}
}