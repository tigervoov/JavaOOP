import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student=new Student("tiger",123456);
        student.setAge(18);
        student.setSex("man");
        System.out.println("该学生的姓名:"+student.getName()+"年龄："+student.getAge()+"性别："+student.getSex()+"学号："+student.getId());
    }
}
