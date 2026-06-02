import java.util.*;
public class Main {
    public static void main(String[] args){
        List<Student> students=new ArrayList<>();
        
        students.add(new Student(1,"GiaHung",8.2));
        students.add(new Student(2,"QuynhChan",9.5));
        students.add(new Student(3,"PhuocNgoc",9.2));

        for(Student student:students){
            System.out.println(student);
        }
        System.out.println("----------------");
        Student maxGpa = students.get(0);
        for(Student student:students){
            if(student.getGpa()>maxGpa.getGpa()){
                maxGpa=student;
            }
        } 

        students.set(1,new Student(4,"MinhTu",7.8));

        students.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        for(Student st:students){
            System.out.println(st);
        }
        if(!isAvailable(1, students)){
            System.out.println("not Available");
        }
        

    }
    public static boolean isAvailable(int id,List<Student> students){
            for (Student student :students){
                if(student.getId()==id){
                    System.out.println("Available");
                    return true;
                }
            }
            return false;
        }
}   
