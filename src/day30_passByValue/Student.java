package day30_passByValue;

public class Student {

    int nummer;
    String name;
    static String college="ITS";

    Student (int r, String n, String college) {
        this.nummer=r;
        this.name=n;
        this.college=college;



    }

    public static void main(String[] args) {

        Student s1=new Student (111,"Karan","MIT");



        Student s2=new Student (222,"Aryan","Harvard");


        System.out.println(s1.nummer);
        System.out.println(s2.nummer);

        System.out.println(s1.name);
        System.out.println(s2.name);


        System.out.println(s1.college);
        System.out.println(s2.college);





    }

}
