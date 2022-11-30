package student;

public class StudentRecord{
public StudentRecord(String name,String srcode, String prog, String dept, String year, String sem){
Name = name;
Srcode = srcode;
Program = prog;
Department = dept;
Year =year;
Semester= sem;
}

public void info(){
System.out.println(Name + " " + Srcode + " " + Program + " " + Department + " " + Year + " " + Semester + " ");
}

public void setName(String name){
Name = name;
}

public void setSrcode(String srcode){
Srcode = srcode;
}

public void setProgram(String prog){
Program = prog;
}

public void setDepartment(String dept){
Department = dept;
}
public void setYear(String year){
Year = year;
}
public void setSemester(String sem){
Semester = sem;
}

public String serialized(){
return Name+"/"+Srcode+"/"+Program+"/"+Department+"/"+Year+"/"+ Semester+"\n";
}

private String Name;
private String Srcode;
private String Program;
private String Department;
private String Year;
private String Semester;
}