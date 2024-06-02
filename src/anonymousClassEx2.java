interface polygon{
    public void display();
}
// * Anonymous class implementing an interface

public class anonymousClassEx2 {
    public void createClass(){
        //implementing the interface
        polygon p1 = new polygon() {
            public void display(){
                System.out.println("Inside an anonymous class");
            }
        };
        p1.display();// calling 
    }

    public static void main(String[] args) {
        anonymousClassEx2 obj = new anonymousClassEx2();
        obj.createClass();
    }


}
