package Day5.Lambda_27_28;
import java.util.ArrayList;

class Student1 {
        private String name;
        private int age;
        private int grade;
        private int course;
        private char sex;
        public Student1(String name, int age, int grade,int course, char sex) {
            this.name = name;
            this.grade = grade;
            this.age = age;
            this.course = course;
            this.sex = sex;
        }
    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", course=" + course +
                ", sex=" + sex +
                '}';
    }

    public char getSex() {
        return sex;

    }
}

interface CheckStudents{
    boolean check(Student1 st);
}

class FilterStudent{
    void infoAboutStudent(ArrayList<Student1> students, CheckStudents cs){
        for(Student1 s:students){
            if(cs.check(s)){
                System.out.println(s);
            }
        }
    }
}

public class Lambda_28 {
    public static void main(String[] args) {
        Student1 student4 = new Student1("Vladislav Alfeldi",25,6,2,'m');
        Student1 student1 = new Student1("Tomas Moravcik",16,8,3,'m');
        Student1 student5 = new Student1("Anna Gregorikova",30,10,4,'f');
        Student1 student3 = new Student1("Tomas Labar",21,8,5,'m');
        Student1 student2 = new Student1("Veronika Sidorova",32,9,1,'f');

        ArrayList<Student1> studentArrayList = new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student3);
        studentArrayList.add(student2);
        studentArrayList.add(student4);
        studentArrayList.add(student5);

        FilterStudent filter = new FilterStudent();
        filter.infoAboutStudent(studentArrayList, (Student1 st) ->{return st.getCourse()<4;});// 1 sposob vivoda lambdy
        System.out.println();
        filter.infoAboutStudent(studentArrayList, st -> st.getGrade()>7); // 2 sposob vivoda lambdy


    }
}

