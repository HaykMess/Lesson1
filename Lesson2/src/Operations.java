public class Operations {   //ALT + CTRL + L կոդի կարգի բերում
    public static void main(String[] args) {
        int x;
        int _x = 4;
        System.out.println(_x);

        int a = 4, b = 5; // test
        int c = a + b;
        System.out.println(c);

        System.out.println(c / b); //qani hat c ka b i mej
        System.out.println(c % b); //mnacord
        double t = 10.0, g = 3.0;
        System.out.println(t / g); // dabli depqum kstananq normal bajanum
        int p = 10;
        boolean pp = p == 10099;
        System.out.println(p % 2 == 0);
        System.out.println(pp);
        System.out.println(16&17); // (Կանոն․ (ԵՎ &)) կտա մեկ եթե երկոջսն էլ մեկ է, այլապես զրո)
        System.out.println(5&7);
        System.out.println(5|7); // (կանոն (Կամ | ) միշտ կտա մեկ բացի երբ եկու հատ զրո լինեն)
        System.out.println(7^7); // (Կանոն XOR ^ Միշտ տալիս ա մեկ, բացի երբ երկուսն էլ նույն բիթն էն 11 Կամ 00)
                // Վերագրման օպերատորներ
        a = 5;
        a = a + 5; // ստանդարտ ձև
        a *= 5; //(կրճատ գրելաձև)
        System.out.println(a);



    }
}
