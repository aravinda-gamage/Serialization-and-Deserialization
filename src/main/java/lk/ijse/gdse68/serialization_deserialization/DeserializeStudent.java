package lk.ijse.gdse68.serialization_deserialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class DeserializeStudent {
    public static void main(String[] args){
        ObjectMapper mapper = new ObjectMapper();
        try {
            Student student = mapper.readValue(new File("student.json"), Student.class);
            System.out.println("Student deserialized 'student.json'");
            System.out.println(student);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
