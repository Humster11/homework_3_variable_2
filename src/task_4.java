public class task_4 {
    public static void main(String[] args) {
        byte prod2Minutes = 16;
        byte prod1Minutes = 16 / 2;

        int prod20Minutes = prod1Minutes * 20;
        System.out.println("За 20 минут машина произвела " + prod20Minutes + " штук бутылок");

        int prod24hours = prod1Minutes * 60 * 24;
        System.out.println("За сутки машина произвела " + prod24hours + " штук бутылок");

        int prod3Days = prod24hours * 3;
        System.out.println("За 3 дня машина произвела " + prod3Days + " штук бутылок");

        long prod1month = prod24hours * 30;
        System.out.println("За месяц машина произвела " + prod1month + " штук бутылок");
    }
}
