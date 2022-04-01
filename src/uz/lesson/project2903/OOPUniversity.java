package uz.lesson.project2903;

public class OOPUniversity {
    public static void main(String[] args) {

        University TDTU = new University(32,"Jhon" );
        TDTU.name = "Tashkent State Technical University";
        TDTU.facultyNum = 23;
        TDTU.entryPoint = 150.7;
        TDTU.studentNum = 11000;
        System.out.println(TDTU.toString());
        University UzMU = new University();
        UzMU.name = "National University of Uzbekistan";
        UzMU.facultyNum = 20;
        UzMU.entryPoint = 160.7;
        UzMU.studentNum = 10200;
        System.out.println(UzMU.toString());
        University ped = new University();
        UzMU.name = "Tashkent State University named after Nizomiy";
        UzMU.facultyNum = 13;
        UzMU.entryPoint = 120.1;
        UzMU.studentNum = 9101;
        System.out.println(UzMU.toString());
        University mdis = new University();
        UzMU.name = "Management Development Institute of Singapore in Tashkent";
        UzMU.facultyNum = 7;
        UzMU.entryPoint = 140.7;
        UzMU.studentNum = 7010;
        System.out.println(UzMU.toString());
        University economic = new University();
        UzMU.name = "Tashkent state university of economics";
        UzMU.facultyNum = 22;
        UzMU.entryPoint = 180.7;
        UzMU.studentNum = 10150;
        System.out.println(UzMU.toString());
    }

}
