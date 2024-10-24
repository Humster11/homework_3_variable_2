public class task_7 {
    public static void main(String[] args) {

        float loseWeight = 7;

        float loseWeightOneDayFirstWayGram = 250;
        float loseWeightOneDayFirstWayKiloGram = loseWeightOneDayFirstWayGram / 1000;

        float loseWeightOneDaySecondWayGram = 500;
        float loseWeightOneDaySecondWayKiloGram = loseWeightOneDaySecondWayGram / 1000;

        float countDayLoseWeightFirstWay = loseWeight / loseWeightOneDayFirstWayKiloGram;
        System.out.println("При сбросе 250 гр. в день, потребуется " + countDayLoseWeightFirstWay + " дней, чтобы добиться резульата");

        float countDayLoseWeightSecondWay = loseWeight / loseWeightOneDaySecondWayKiloGram;
        System.out.println("При сбросе 500 гр. в день, потребуется " + countDayLoseWeightSecondWay + " дней, чтобы добиться резульата");

    }
}
