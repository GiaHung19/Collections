

public class Student {
    private int id;
    private String name;
    private Double gpa;

    public Student(int id,String name,Double gpa){
        this.id=id;
        this.name=name;
        this.gpa=gpa;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public Double getGpa(){
        return this.gpa;
    }
    @Override
    public String toString(){
        return this.id+"-"+this.name+"-"+this.gpa;
    }
}
