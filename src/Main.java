public class Main {
    public static void main(String[] args){
        int[] zahlen=new int[3] ;
        int[] auchZahlen={8,7,3};
        int summe;
        zahlen[0]=5;
        zahlen[1]=7;
        zahlen[2]=16;
        System.out.println(zahlen[0]+" "+zahlen[2]);
        summe=zahlen[0]+zahlen[1];
        System.out.println(summe);
        System.out.println(zahlen[0]+zahlen[1]);
        System.out.println(auchZahlen[0]+" "+auchZahlen[2]);
        summe=auchZahlen[0]+auchZahlen[1];
        System.out.println(summe);
        System.out.println(auchZahlen[0]+auchZahlen[1]);
        System.out.println(zahlen.length);
        System.out.println(zahlen.length);

        /*1 3 ausgeben
            1+2 ausgeben
            länge des array ausgeben*/

    }
}
