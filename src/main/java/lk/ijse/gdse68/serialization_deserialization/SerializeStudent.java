package lk.ijse.gdse68.serialization_deserialization;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class SerializeStudent {
    public static void main(String[] args){
        Student student = new Student("Aravinda","25","Boossa");

        ObjectMapper mapper = new ObjectMapper();
        try{
            mapper.writeValue(new File("student.json"), student);
            System.out.println("Student serialized 'student.json'");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
