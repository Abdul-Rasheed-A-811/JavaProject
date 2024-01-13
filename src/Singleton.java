public class Singleton {
    // Private static instance variable to hold the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {
        // Initialization code, if needed
    }

    // Public method to get the single instance of the class
    public static Singleton getInstance() {
        // Lazy initialization: create the instance only if it hasn't been created yet
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Other methods and attributes can be added as needed

    public void showMessage() {
        System.out.println("Hello, I am a Singleton!");
    }
}
