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
        int k = 6;
        if (k < 13)
            System.out.println("Barev");
            // if ի տակի տողն ա ենթարկվում նրան, եթե ուզում եք կիրառել այլ տողեր ապա կիրառել ձևավոր փակագիժ
        else
            System.out.println("Barev 1");
        int u;
        if (k > 5)
            u = 10;
        else                //նմանատիպ
            u = 20;
        System.out.println(u);
        u = k > 5 ? 10 : 20;    // կրճատ ձև
        System.out.println(u);

        u = -1;
        if (u > 0) {
            System.out.println("Positive");
        } else {
            if (u < 0)
                System.out.println("Negative");
            else System.out.println("Neitral");
        }
        System.out.println(u > 0 ? "Negative" : u < 0 ? "Neitral" : "Positive");
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

        int p = 11;
        if (p > 0) {
            System.out.println("Barev");
            System.out.println("barev1");
        } else
            System.out.println("barev2");
        System.out.println("______________");
        for (int bb = 1; bb < 100; bb ++ ) {
            System.out.println(bb);
        }
        while (p < 13) {
            p++;
            System.out.println("Hi");
        }

            for (int tu=10;tu<15;tu++){
                System.out.println("Hi");
                System.out.println("___________________"); }
       /* String[] names = {"Hayk","Hasmik","Hakob","Mariam", "Gagik" };
                //System.out.println(names[0]+" "+names[1]);
                for(int i = 0; i <= names.length-1; i++) {
                    System.out.println(names[i]);
                }
                for (String s:names)
        {
            System.out.println(s);
        } */
        String[] names = {"Hayk","Hasmik","Hakob","Mariam", "Gagik"};
        //System.out.println(names[0]+" "+names[1]);
        for(int i = names.length-1; i >= 0; i--) {
            System.out.println(names[i]);
        }
        for (int i=1; i<=10; i++)
        {
            if (i == 5)
                continue;
                System.out.println(i);

            }
        }

}










