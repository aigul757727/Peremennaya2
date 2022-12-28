public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 3;
        short b = 1;
        int c = 8;
        long d = 5;
        float e = 5f;
        double f = 2.7;
        System.out.println("Значение переменной a c типом  byte равно" + " "+ a);
        System.out.println("Значение переменной b c типом  short равно" + " "+ b);
        System.out.println("Значение переменной c c типом  int равно" + " "+ c);
        System.out.println("Значение переменной d c типом  long равно" + " "+ d);
        System.out.println("Значение переменной e c типом  float равно" + " "+ e);
        System.out.println("Значение переменной f c типом  double равно" + " "+ f);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        byte n = 67;
        short y = -159;
        int w = 27897;
        int s = 569;
        long i = 987678965549l;
        float o = 27.12f;
        double p = 2.786;
        System.out.println(n);
        System.out.println(y);
        System.out.println(w);
        System.out.println(s);
        System.out.println(i);
        System.out.println(o);
        System.out.println(p);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        int Class = (LP+ AS + EA);
        short paper = 480;
        int paperClass = paper/Class;
        System.out.println("На каждого ученика рассчитано" + " " + paperClass +" "+ "листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte a = 16;
        byte b = 2;
        int OneMin =a/b;
        //System.out.println(OneMin);
        byte Min = 20;
        int Proiz1 = Min*OneMin;
        System.out.println("За " + Min + " "+ "минут машина произвела "+ Proiz1 + " " + "штук бутылок");
        byte hourMin =60;
        byte hour = 24;
        int MinDay = hour*hourMin;
        int Proiz2 = MinDay*OneMin;
        System.out.println("За сутки машина произвела "+ Proiz2 + " " + "штук бутылок");
        byte Day =3;
        int MinThreeDay = Day*hour*hourMin;
        //System.out.println(MinThreeDay);
        int Proiz3 = OneMin*MinThreeDay;
        System.out.println("За 3 дня машина произвела "+ Proiz3 + " " + "штук бутылок");
        byte DayMonth =31;
        int MinDayMonth = DayMonth*hour*hourMin;
        int Proiz4 = MinDayMonth*OneMin;
        System.out.println("За 1 месяц машина произвела "+ Proiz4 + " " + "штук бутылок");
       }
    public static void task5 () {
        System.out.println("Задача 5");
        int a =120;
        int b = 2;
        int c = 4;
        int Oneclass = b+c;
        int Class = a/Oneclass;
        //System.out.println(Class);
        int r =2*Class;
        int y = 4* Class;
        System.out.println("В школе, где " + Class + " "+ "классов, нужно " + r + " банок белой краски и " + y +
                " банок коричневой краски");
    }
        public static void task6() {
            System.out.println("Задача 6");
            int a =5;
            int b =a*80;
            int c =2;
            int d =c*105;
            int f = 2;
            int r =2*100;
            int o = 4;
            int e = o*70;
            int w = b+d+r+e;
            float t = 1.000f;
            float q =w/t;
            System.out.println(q + " г");
            float s = q/1000f;
            System.out.println(s + " кг");

    }
    public static void task7() {
        System.out.println("Задача 7");
        int t = 7;
        int l = 1000;
        int w = 250;
        int x= 500;
        int j = t*l;
        int n = j/w;
        System.out.println (n + " дней уйдет на похудение, если спортсмен будет " +
                "терять каждый день по 250 грамм");
        int d = j/x;
        System.out.println (d + " дней уйдет на похудение, если спортсмен будет " +
                "терять каждый день по 500 грамм");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int z =10;
        int M = 67760;
        int D = 83690;
        int K = 76230;
        int M1 = M+M/z;
        int D1 = D+D/z;
        int K1 = K+K/z;
        System.out.println (M1);
        System.out.println (D1);
        System.out.println (K1);
        int MGod1 = M*12;
        int DGod1 = D*12;
        int KGod1 = K*12;
        int MGod2 = M1*12 - MGod1;
        int DGod2  = D1*12 - DGod1;
        int KGod2  = K1*12 - KGod1;
        System.out.println ("Маша теперь получает " + M1 + " рублей. " +
                "Годовой доход вырос на " + MGod2 + " рублей");
        System.out.println ("Денис теперь получает " + D1 + " рублей. " +
                "Годовой доход вырос на " + DGod2  + " рублей");
        System.out.println ("Кристина теперь получает " + K1 + " рублей. " +
                "Годовой доход вырос на " + KGod2  + " рублей");
    }

}