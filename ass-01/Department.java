public class Department {
   private String deptName;
   private int deptCode;
   private String deptFeculty;
   public static void main(String[] args){
      Department d1 = new Department();
      Department d2 = new Department();
      d1.deptName = "CSE";
      d1.deptCode = 10;
      d1.deptFeculty = "FSIT";
      d2.deptName = "SWE";
      d2.deptCode -= 20;
      d2.deptFeculty = "FSIT";
      System.out.println("Department1 name is:" +d1.deptName);
      System.out.println("Department1 code is:" +d1.deptCode);
      System.out.println("Department1 feculty is:" +d1.deptFeculty);
      System.out.println("\n\nDepartment2 name is:" +d2.deptName);
      System.out.println("Department2 code is:" +d2.deptCode);
      System.out.println("Department2 feculty is:" +d2.deptFeculty);


   }
}
