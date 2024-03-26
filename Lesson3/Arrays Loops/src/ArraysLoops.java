public class ArraysLoops {
    public static void main(String[] args) {
        int[] a = new int[9];
        a[0] =1;
        a[4] =87;
        a[8] =6;
        System.out.println(a[4]);
        System.out.println(a[0] + a[4]);
        System.out.println(a.length);
        // եթե ուզում ենք, որ տպի մշտական սկզբից մինչև վերջ անկախ փոփոխություններից լավ է նշենք այս կերպ
        System.out.println(a[0] + a[a.length-1]); //որտեղ վերցնում ենք միջակայքի երկարությունը սկզբից վերջ



       int[] t = {5, 8, 3, 42, 1, 3, 4};  // (Կրճատ 2 ձև )
       System.out.println(t[3]);

        int[] r;
        r = new int [] {5, 8, 42, 1, 3, 4};
        System.out.println(r[2]);

        //if գործողությունները
        int d = 3;
                if (d < 4)
        System.out.println("Barev");


    }

}
