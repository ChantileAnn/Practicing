import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import bloodbank.BloodDonation;

public class Filesystem{
    public Filesystem(){
        try{
            file = new File("Donor.data");
            if(!file.exists()){
                file.createNewFile();
            }
        }catch(Exception e){}
    }

    public ArrayList<BloodDonation> readFile(){
        ArrayList<BloodDonation> array = new ArrayList<>();
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String raw = sc.nextLine();
                String[] substrings = raw.trim().split("/");
                BloodDonation blood = new BloodDonation (substrings[0], substrings[1], substrings[2], substrings[3],substrings[4],substrings[5]);
                array.add(blood);
            }  
            sc.close();
        }catch(Exception e){}
        return array;
    }

    public void updateFile(ArrayList<BloodDonation> Blood){
        try{
            FileWriter writer = new FileWriter(file);
            for (BloodDonation blood : Blood) {
                writer.write(blood.serialized());
            }
            writer.close();
        }catch(Exception e){}
    }

    File file;
}

