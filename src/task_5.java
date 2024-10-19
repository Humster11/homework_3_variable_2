public class task_5 {
    public static void main(String[] args){
        byte allCanPaintForRepair = 120;
        byte countCanWhitePaintOneClass = 2;
        byte countCanBrownPaintOneClass = 4;

        int allPaintOneClass = countCanWhitePaintOneClass+countCanBrownPaintOneClass;

        int countClass = allCanPaintForRepair/allPaintOneClass;

        int allCanWhiteForRepair = countCanWhitePaintOneClass*countClass;
        int allCanBrownForRepair = countCanBrownPaintOneClass*countClass;

        System.out.println("В школе, где "+countClass+" классов, нужно "+allCanWhiteForRepair+" банок белой краски и "+allCanBrownForRepair+" банок коричневой краски");

    }
}
