package Obj_Oriented_Prg;

public class Ogrenci_Bilgi {
    //main
    public static void main(String[] args){
        Course mat=new Course("Matematik","MATH101","MATHS");
        Course fizik=new Course("Fizik","PHYS101","PHYS");
        Course kimya=new Course("Kimya","CHEM101","CHEM");

        Teacher t1=new Teacher("Mahmut Hoca","23482384","MATHS");
        Teacher t2=new Teacher("Ahmet Hoca","34583458","PHYS");
        Teacher t3=new Teacher("Ayse Hoca","340598345","CHEM");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();


    }
}
