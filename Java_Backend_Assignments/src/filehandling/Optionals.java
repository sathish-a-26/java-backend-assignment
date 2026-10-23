package filehandling;


import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {

        String name = null;
        Optional<String> studentName = Optional.ofNullable(name);

        System.out.println(
            studentName.orElse("student name not available")
        );
    }
}
