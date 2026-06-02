import java.util.*;
public class Main {
    public static void main(String[] args){
        List<Student> students=new ArrayList<>();
        
        students.add(new Student(1,"GiaHung",8.2));
        students.add(new Student(2,"QuynhChan",9.5));
        students.add(new Student(3,"PhuocNgoc",9.2));

        for(Student st:students){
            System.out.println(st);
        }
        System.out.println("----------------");
        Student maxGpa = students.get(0);
        for(Student student:students){
            if(student.getGpa()>maxGpa.getGpa()){
                maxGpa=student;
            }
        } 
        System.out.println(maxGpa);
    }
}   
