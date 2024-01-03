package jdbc.utils;

public class QueryUtil {
   public static String inserEmp() {
	   return "insert into emp_info (emp_name,emp_address,emp_salary) values(?,?,?)";
   }
   
   public static String selectAllEmp() {
	   return "select * from emp_info";
   }
   
   public static String QueryAllEmpById(int empId) {
	   return "select * from emp_info where id = "+empId;
   }
   
   public static String deleteQuery(int empId) {
	   return "delete from emp_info where id = "+empId;
   } 
   
   public static String updateEmpQuery(int empId) {
	   return "update emp_info set emp_name = ? ,emp_address = ? ,emp_salary = ?  where id = "+empId;
   }
}
