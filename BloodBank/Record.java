import java.util.ArrayList;
import java.util.Scanner;

import bloodbank.BloodDonation;

public class Record {
    Filesystem fs;
    Record(){
        fs = new Filesystem();
        Record = fs.readFile();
    }

    public void run(){
        while(true){
            switch(menu()){
                case 1:
                    add();
                break;
                case 2:
                    display();
                break;
                case 3:
                    update();
                break;
                case 4:
                    remove();
                break;
                case 5:
                System.out.println("bye.");
                    System.exit(0);
            }
            fs.updateFile(Record);
        }
    }

    private void add(){
        System.out.print("Enter Fullname:");
        String name = sc.nextLine();
        System.out.print("Enter Age:");
        String age = sc.nextLine();
        System.out.print("Enter Gender:");
        String gender = sc.nextLine();
        System.out.print("Enter Address:");
        String address = sc.nextLine();
        System.out.print("Enter Contact:");
        String contact =sc.nextLine();
        System.out.print("Enter Bloodtype:");
        String blood = sc.nextLine();
        BloodDonation Blood = new BloodDonation(name,age,gender,address,contact,blood);
        Record.add(Blood);
    }

    private void display(){
        int index = 0;
        for(BloodDonation Blood : Record){
            System.out.print("[" + index ++ + "]:   "); 
            Blood.info();
        }
    }

    private void update(){
        display();
        System.out.print("Enter record index: ");
        int index = Integer.parseInt(sc.nextLine());
        BloodDonation Blood = Record.get(index);
        System.out.print("Enter new name: ");
        String name = sc.nextLine();
        System.out.print("Enter new age: ");
        String age = sc.nextLine();
        System.out.print("Enter new gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter new address: ");
        String address = sc.nextLine();
        System.out.print("Enter new contact:");
        String contact = sc.nextLine();
        System.out.print("Enter new bloodtype:");
        String blood = sc.nextLine();
        
        Blood.setName(name);
        Blood.setAge(age);
        Blood.setGender(gender);
        Blood.setAddress(address);
        Blood.setContact(contact);
        Blood.setBloodtype(blood);

        Record.set(index, Blood);
        System.out.println("The record has been updated.");
    }

    private void remove(){
        display();
        System.out.print("Enter record index: ");
        int index = Integer.parseInt(sc.nextLine());
        Record.remove(index);
        System.out.println("Removed.");
        display();
    }

    private int menu(){
        System.out.println("\n\n\t\t============================\n\t\t      *|Blood Donation|* \n\t\t============================\n ");
        System.out.println("============================");
        System.out.println("\n1. Donor Record.");
        System.out.println("2. Display Record.");
        System.out.println("3. Update Record.");
        System.out.println("4. Remove Record.");
        System.out.println("5. Exit.");
        System.out.println("============================");
        System.out.print("Enter choice:");
        return Integer.parseInt(sc.nextLine());
    }
    Scanner sc = new Scanner(System.in);
    ArrayList<BloodDonation> Record = new ArrayList<>();  
}


