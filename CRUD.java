import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] phonebook = new String[100];
        int numberOfContacts = 0;
        while(true){
            System.out.println("\n\n=========================");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("0. Exit");
            System.out.print("Enter your choice -> ");
            String choice = sc.nextLine();
            switch(choice){
                case "1":
                    System.out.println("\n======================");
                    System.out.print("Enter a phone number: ");
                    String phoneNumber = sc.nextLine();
                    phonebook[numberOfContacts] = phoneNumber;
                    numberOfContacts ++;
                    System.out.println("Added");
 
                break;
                case "2":
                    if(numberOfContacts == 0){
                        System.out.println("No Contacts");
                    }
                    else{
                        System.out.println("\n======================");
                        System.out.print("Contacts\n");
                        for(int i = 0;i<numberOfContacts;i++){
                            System.out.println(phonebook[i]);
                        }   
                    }

                break;
                
                case "3": 
                    System.out.println("\n======================");
                    System.out.print("Enter index to Edit: ");  
                    int indexToEdit = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter a New Number: ");
                    phonebook[indexToEdit] = sc.nextLine();
                    System.out.print("edited");
                     System.out.println("\n======================");
                  break;   
                case "4":
                     System.out.println("\n======================");
                    System.out.print("Enter index to Delete: ");
                        String indexToDelete = sc.nextLine(); 
                     System.out.println("\n======================");
                break;
               
                default:
                    System.out.print("exiting");
                    return;
            
            }
        }
    }
}

