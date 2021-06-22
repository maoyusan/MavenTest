package Amarry;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author Administrator
 */
@Setter
@Getter
@ToString
@Accessors(chain = true)
public class Student {
    int id;
    String name;
    int age;

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(18).setAge(20).setName("张三");
        System.out.println(student.age + student.name);
    }
}