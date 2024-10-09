package org.example.lambda;

import java.util.ArrayList;
import java.util.Collections;

public class StudentInfo {
    void testStudent(ArrayList<Student> al,StudentChecks sc){
        for (Student s : al){
            if (sc.check(s)){
                System.out.println(s);
            }
        }
    }

//   void printStudentsOverGrade(ArrayList<Student> al, double grade){
//       for (Student s : al){
//           if (s.avgGrade>grade){
//               System.out.println(s);
//           }
//       }
//   }
//   void printStudentsUnderAge(ArrayList<Student> al, int age){
//       for (Student s : al){
//           if (s.age>age){
//               System.out.println(s);
//           }
//       }
//   }
//   void printStudentsMixCondition(ArrayList<Student> al,int age, double grade,char sex){
//       for (Student s : al){
//           if (s.age>age && s.avgGrade<grade && s.sex==sex){
//               System.out.println(s);
//           }
//       }

}

class Test{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',22,3,6.2);
        Student st2 = new Student("Ivana",'f',32,4,7.2);
        Student st3 = new Student("Sven",'m',25,2,5.2);
        Student st4 = new Student("Alex",'m',27,3,6.9);
        Student st5 = new Student("Petr",'m',32,4,8.2);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        System.out.println();
        info.testStudent(students, s-> s.avgGrade>7);
        System.out.println();
        info.testStudent(students, s->s.age<30);
        System.out.println();
        info.testStudent(students,s->s.age>20 && s.avgGrade>7 && s.sex == 'm');

       // System.out.println(info);
        info.testStudent(students,new CheckOverGrade());

        System.out.println();
        info.testStudent(students,s->s.age>30);

        students.sort((s1, s2) -> s1.course - s2.course);
        System.out.println(students);


      /* info.printStudentsOverGrade(students,8);
        System.out.println();
        info.printStudentsUnderAge(students,25);
        System.out.println();
        info.printStudentsMixCondition(students,20,7,'m');*/
    }
}
interface StudentChecks{
    boolean check(Student s);
}
class CheckOverGrade implements StudentChecks{

    @Override
    public boolean check(Student s) {
        return s.avgGrade>7;
    }
}
