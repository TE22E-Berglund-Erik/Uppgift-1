public class App {
    public static void main(String[] args) throws Exception {
       int tal1 = 2;
       int tal2 = 30;
       
       int summa = tal1+tal2;
       int differens = tal2-tal1;

        System.out.println("summan av tal + tal 2 är "+summa);
        System.out.println("differensen av tal2 - tal1 är "+differens);
        
        int produkt=tal1*tal2;
        int kvot = tal1/tal2;

        System.out.println("produkten av tal1*tal2 är "+produkt);
        System.out.println("kvoten av tal1/tal2 är "+kvot);

        int rest1 = 10%3;
        int rest2 = 9%3;

        System.out.println("resten av 10/3 är "+rest1);
        System.out.println("resten av 9/3 är "+rest2);

        
        double decimal_tal1 = 5.0;
        double decimal_tal2 = 23.41;

        double dec_summa_add = decimal_tal1+decimal_tal2;
        double dec_summa_sub = decimal_tal1-decimal_tal2;

        System.out.println("Summan av additionen är "+dec_summa_add);
        System.out.println("Summan av subtraktionen är "+dec_summa_sub);





    }
}
