public class task_6 {
    public static void main(String[] args){
        byte weightOneBanana = 80;
        byte countBananas = 5;
        int allWeightBananas = weightOneBanana*countBananas;

        int allMilliliterMilk = 200;
        int countPackMilk = allMilliliterMilk/100;
        int weightMilk100ML = 105;
        int weightMilkAll = weightMilk100ML*countPackMilk;

        int wightIceCreamOne = 100;
        byte countBriquetteIceCream = 2;
        int weightIceCreamAll = wightIceCreamOne*countBriquetteIceCream;

        int weightOneEgg = 70;
        byte countEggs = 4;
        int weightAllEggs = weightOneEgg*countEggs;

        int weightGramSportBreakfast = allWeightBananas+weightMilkAll+weightIceCreamAll+weightAllEggs;

        System.out.println("Вес спортзавтрака в граммах "+weightGramSportBreakfast+" гр");

        int weighKilogramsSportBreakfast = weightGramSportBreakfast/1000;

        System.out.println("Вес спортзавтрака в килограммах "+weighKilogramsSportBreakfast+" кг");

        }
}
