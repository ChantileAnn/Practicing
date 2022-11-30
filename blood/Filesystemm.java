import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import student.StudentRecord;

public class Filesystemm {
    public Filesystemm(){
        try{
            file = new File("Student.data");
            if(!file.exists()){
                file.createNewFile();
            }
        }catch(Exception e){}
    }

    public ArrayList<StudentRecord> readFile(){
        ArrayList<StudentRecord> array = new ArrayList<>();
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String raw = sc.nextLine();
                String[] substrings = raw.trim().split("/");
                StudentRecord s = new StudentRecord(substrings[0], substrings[1], substrings[2], substrings[3],substrings[4],substrings[5]);
                array.add(s);
            }  
            sc.close();
        }catch(Exception e){}
        return array;
    }

    public void updateFile(ArrayList<StudentRecord> Student){
        try{
            FileWriter writer = new FileWriter(file);
            for (StudentRecord s : Student) {
                writer.write(s.serialized());
            }
            writer.close();
        }catch(Exception e){}
    }

    File file;
}