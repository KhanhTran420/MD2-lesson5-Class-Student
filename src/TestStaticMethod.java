public class TestStaticMethod {
    public static void main(String[] args) {
        //Gọi Phương thức
        Student.change();

        //xây dựng đối tượng
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        //gọi phương thức ra màn hình
        s1.display();
        s2.display();
        s3.display();
    }
}
