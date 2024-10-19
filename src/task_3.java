public class task_3 {
    public static void main(String[] args){
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;

        int paperForOneStudents = 480/(LP+AS+EA);

        System.out.println("На каждого ученика рассчитано "+paperForOneStudents+" листов бумаги");
    }
}
