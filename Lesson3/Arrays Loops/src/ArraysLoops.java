public class ArraysLoops {
    public static void main(String[] args) {
        int[] a = new int[9];
        a[0] = 1;
        a[4] = 87;
        a[8] = 6;
        System.out.println(a[4]);
        System.out.println(a[0] + a[4]);
        System.out.println(a.length);
        // եթե ուզում ենք, որ տպի մշտական սկզբից մինչև վերջ անկախ փոփոխություններից լավ է նշենք այս կերպ
        System.out.println(a[0] + a[a.length - 1]); //որտեղ վերցնում ենք միջակայքի երկարությունը սկզբից վերջ


        int[] t = {5, 8, 3, 42, 1, 3, 4};  // (Կրճատ 2 ձև )
        System.out.println(t[3]);

        int[] r;
        r = new int[]{5, 8, 42, 1, 3, 4};
        System.out.println(r[2]);

        //if գործողությունները
        int d = 6;
        if (d < 13)
        System.out.println("Barev");
        // if ի տակի տողն ա ենթարկվում նրան, եթե ուզում եք կիրառել այլ տողեր ապա կիրառել ձևավոր փակագիժ
        else
        System.out.println("Barev 1");
        int u;
            if (d > 5)
                u = 10;
            else                //նմանատիպ
                u = 20;
        System.out.println(u);
        u = d > 5 ? 10 : 20;    // կրճատ ձև
        System.out.println(u);

        u = -1;
        if (u > 0) {
                System.out.println("Positive");
            }
            else {
                if (u < 0)
                    System.out.println("Negative");
                else System.out.println("Neitral");
        }
        System.out.println(u > 0 ? "Negative" : u < 0 ? "Neitral" : "Positive" );
                            //switch
        System.out.println("____________");
        u = 1;
            switch (u) {
                case 1:
                    System.out.println("one");
                    break;
                case 0:
                    System.out.println("zero");
                    break;
                case 2:
                    System.out.println("two");
                    break;

            }
    }

}
