public class Student {
   private String name;
   private int id;
   private double cgpa;
   public static void main(String[] args){
       Student std1 = new Student();
       Student std2 = new Student();
       std1.name = "Tanjid";
       std1.id = 4757;
       std1.cgpa = 3.7;
       std2.name = "Abdullah";
       std2.id = 100;
       std2.cgpa = 3.5;
       System.out.println("Student1 name is: "+std1.name);
       System.out.println("Student1 id is: "+std1.id);
       System.out.println("Student1 cgpa is: "+std1.cgpa);
       System.out.println("\n\nStudent2 name is: "+std2.name);
       System.out.println("Student2 id is: "+std2.id);
       System.out.println("Student2 cgpa is: "+std2.cgpa);
   }

}
