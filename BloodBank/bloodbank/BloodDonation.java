package bloodbank;

public class BloodDonation{
    public BloodDonation(String name,String age, String gender, String address, String contact, String blood){
        Name = name;
        Age = age;
        Gender = gender;
        Address = address;
        Contact =contact;
        Bloodtype= blood;
    }

    public void info(){
        System.out.println(Name + " " + Age + " " + Gender + " " + Address + " " + Contact + " " + Bloodtype + " ");
    }

    public void setName(String name){
        Name = name;
    }

    public void setAge(String age){
       Age = age;
    }

    public void setGender(String gender){
        Gender = gender;
    }

    public void setAddress(String address){
        Address = address;
    }
    public void setContact(String contact){
        Contact = contact;
    }
    public void setBloodtype(String blood){
        Bloodtype = blood;
    }

    public String serialized(){
        return Name+"/"+Age+"/"+Gender+"/"+ Address+"/"+Contact+"/"+ Bloodtype+"\n";
    }

    private String Name;
    private String Age;
    private String Gender;
    private String Address;
    private String Contact;
    private String Bloodtype;
}

