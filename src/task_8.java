public class task_8 {
    public static void main(String[] args){

        int percentSalaryInc = 10;

        int salaryMasha = 67760;
        int salaryYearMasha = salaryMasha*12;
        int salaryIncMasha = salaryMasha*percentSalaryInc/100;
        int newSalaryMasha = salaryMasha+salaryIncMasha;
        int newSalaryYearMasha = newSalaryMasha*12;
        int diffYearSalaryMasha = newSalaryYearMasha-salaryYearMasha;

        System.out.println("Маша теперь получвет "+newSalaryMasha+" рублей. Годовой доход вырос на "+diffYearSalaryMasha+" рублей");

        int salaryDenis = 83690;
        int salaryYearDenis = salaryDenis*12;
        int salaryIncDenis = salaryDenis*percentSalaryInc/100;
        int newSalaryDenis = salaryDenis+salaryIncDenis;
        int newSalaryYearDenis = newSalaryDenis*12;
        int diffYearSalaryDenis = newSalaryYearDenis-salaryYearDenis;
        System.out.println("Денис теперь получвет "+newSalaryDenis+" рублей. Годовой доход вырос на "+diffYearSalaryDenis+" рублей");

        int salaryKris = 76230;
        int salaryYearKris = salaryKris*12;
        int salaryIncKris = salaryKris*percentSalaryInc/100;
        int newSalaryKris = salaryKris+salaryIncKris;
        int newSalaryYearKris = newSalaryKris*12;
        int diffYearSalaryKris = newSalaryYearKris-salaryYearKris;
        System.out.println("Кристина теперь получвет "+newSalaryKris+" рублей. Годовой доход вырос на "+diffYearSalaryKris+" рублей");


    }
}
