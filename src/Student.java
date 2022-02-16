public class Student {
    private  int rollno;
    private  String name;
    private static String college = "BBDIT";

    // Hàm khởi tạo để khởi tạo biến

    Student(int r, String n){
        rollno = r;
        name = n;
    }
     static void change(){
        college = "CODEGYM";
     }

     void display(){
         System.out.println(rollno + " " + name + " " + college);
     }
}
