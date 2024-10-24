public class task_3 {
    public static void main(String[] args) {
        byte studentsFirstTeacher = 23;
        byte studentSecondTeacher = 27;
        byte studentThirdTeacher = 30;

        int paperForOneStudents = 480 / (studentsFirstTeacher + studentSecondTeacher + studentThirdTeacher);

        System.out.println("На каждого ученика рассчитано " + paperForOneStudents + " листов бумаги");
    }
}
