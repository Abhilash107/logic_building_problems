 class myInfo {
    public void display(){
        System.out.println("Anonymous class");
    }
}

// * Anonymous class extending a class

public class anonymousEx1{

    public void createClass (){
        myInfo m1 = new myInfo(){
            public void display(){
                System.out.println("Inside an anonymous class");
            }
        
        };
        m1.display();
    }

    public static void main(String[] args) {
        anonymousEx1 obj = new anonymousEx1();
        obj.createClass();
    }
    
    
}
