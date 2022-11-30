import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number you showed: ");
        int num = input.nextInt();

        if(num > 0){
            System.out.print("Square = "+ num*num);
        }
        else if(num < 0){
            System.out.print("Cube = "+ num*num*num);
        }
        else {
            System.out.print("Zero");
        }
    }
}
