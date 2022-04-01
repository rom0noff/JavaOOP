package uz.lesson.project2903;

public class University {
    //
    public int studentNum;
    public String name;
    public double entryPoint;
    public int facultyNum;
    String contract;

    public University(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }
    public University(){

    }

    @Override
    public String toString() {
        return "University{" +
                " name='" + name + '\'' +
                ", number of students=" + studentNum +
                ", entry score=" + entryPoint +
                ", number of faculties=" + facultyNum +
                '}';
    }
}
