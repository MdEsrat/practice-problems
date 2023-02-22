public class Student1 {
    private String id;
    private String name;
    private double cgpa;
    public void insert_Record(String id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public void display_Record(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
        System.out.println("CGPA: "+cgpa);
    }
    public static void main(String[] args){
        Student1 st1 = new Student1();
        st1.insert_Record("221-15-4757","Tanjid",3.7);
        st1.display_Record();
    }
}
