public class test {
    public static void main(String[] args) {
        myInterface ref = (name) ->{
            System.out.println("Name: "+ name);
        };
        ref.display("messi");
    }
    

}

interface myInterface {
    void display(String name);
}