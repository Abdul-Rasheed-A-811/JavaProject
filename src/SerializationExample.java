import java.io.*;

// A simple class that implements Serializable
record Student(String name, int age) implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L; // Used for version control during deserialization

}

public class SerializationExample {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John", 25);

        // Serialize the object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
            oos.writeObject(student);
            System.out.println("Serialization completed. Object saved to student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("Deserialization completed. Student details: " + deserializedStudent.name() + ", " + deserializedStudent.age());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
