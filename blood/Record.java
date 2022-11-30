import java.util.ArrayList;
import java.util.Scanner;

import student.StudentRecord;

public class Record {
Filesystemm fs;
Record(){
fs = new Filesystemm();
Records = fs.readFile();
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
fs.updateFile(Records);
}
}

private void add(){
System.out.print("Enter Fullname:");
String name = sc.nextLine();
System.out.print("Sr-code:");
String srcode = sc.nextLine();
System.out.print("Program:");
String program = sc.nextLine();
System.out.print("Department:");
String dept = sc.nextLine();
System.out.print("Year:");
String year =sc.nextLine();
System.out.print("Semester:");
String sem = sc.nextLine();
StudentRecord student = new StudentRecord(name,srcode,program,dept,year,sem);
Records.add(student);
}

private void display(){
int index = 0;
for(StudentRecord student : Records){
System.out.print("[" + index ++ + "]: "); 
student.info();
}
}

private void update(){
display();
System.out.print("Enter record index: ");
int index = Integer.parseInt(sc.nextLine());
StudentRecord Student = Records.get(index);
System.out.print("Enter new name: ");
String name = sc.nextLine();
System.out.print("Enter new srcode: ");
String srcode = sc.nextLine();
System.out.print("Enter new program: ");
String prog = sc.nextLine();
System.out.print("Enter new department: ");
String dept = sc.nextLine();
System.out.print("Enter new year:");
String year = sc.nextLine();
System.out.print("Enter new semester:");
String sem = sc.nextLine();

Student.setName(name);
Student.setSrcode(srcode);
Student.setProgram(prog);
Student.setDepartment(dept);
Student.setYear(year);
Student.setSemester(sem);

Records.set(index, Student);
System.out.println("The record has been updated.");
}

private void remove(){
display();
System.out.print("Enter record index: ");
int index = Integer.parseInt(sc.nextLine());
Records.remove(index);
System.out.println("Removed.");
display();
}

private int menu(){
System.out.println("\n\n\t\t============================\n\t\t *|Student Record|* \n\t\t============================\n ");
System.out.println("============================");
System.out.println("\n1.Student Record.");
System.out.println("2. Display Record.");
System.out.println("3. Update Record.");
System.out.println("4. Remove Record.");
System.out.println("5. Exit.");
System.out.println("============================");
System.out.print("Enter choice:");
return Integer.parseInt(sc.nextLine());
}
Scanner sc = new Scanner(System.in);
ArrayList<StudentRecord> Records = new ArrayList<>(); 
}
