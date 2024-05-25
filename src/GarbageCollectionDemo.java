public class GarbageCollectionDemo {
    public static void main(String[] args) {
        // Create objects
        MyClass obj1 = new MyClass(1);
        MyClass obj2 = new MyClass(2);
        MyClass obj3 = new MyClass(3);

        // Set obj2 to null, making it eligible for garbage collection
        obj2 = null;

        // Call garbage collection explicitly
        System.gc();

        // Delay to observe the effect of garbage collection
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    private int id;

    public MyClass(int id) {
        this.id = id;
        System.out.println("Object " + id + " created.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + id + " finalized and garbage collected.");
    }
}
