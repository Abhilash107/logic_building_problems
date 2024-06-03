@FunctionalInterface //It is optional
interface MyInterface{
// abstract method
void getPiValue();
}
public class AnonymousClass {
public static void main( String[] args ) {
double pi = 3.1415;
// without lambda expression, MyInterface implementation
// using anonymous class
MyInterface ref = new MyInterface(){
public void getPiValue(){
System.out.println("Value of Pi = " + pi);
}
};
ref.getPiValue();
}
}