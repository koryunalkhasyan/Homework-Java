pRuleset Nameublic class Second {
    public static void main(String[] args) {
        int number = 5689;
        int division = 54;

        int value1 = number / 1000;
        System.out.println(value1);

        int value2 = (number / 100) % 10;
        System.out.println(value2);

        int value3 = (number / 10) % 10;
        System.out.println(value3);

        int value4 = (number / 1) % 10;
        System.out.println(value4);
        // Քառանիշ թիվը տպում է առանձին թվանշաններով
        int a = 55;
        int b  = 62;
        int c  =  a++;
        int d =  b++;
        System.out.println(  "c value got of value of a "  + c );
        System.out.println(  "d value got of value of b "  + d );
        System.out.println(  "a value add to one  "  + a);
        System.out.println(  "b value add to one "  + b );
        /*Վերագրում եք 2 այլ c, d փոփոխականի նենց,
        որ վերագրման statement-ի ավարտից հետո c-ն ու d-ն ընդունեն a-ի ու b-ի սկզբնական արժեքները, իսկ a-ն ու b-ն մեկով մեծացած լինեն
         */
        int e = c--;
        int f = d--;
        System.out.println("e value got of value of c "  + e);
        System.out.println("f value got of value of d " + f);
        System.out.println("e value sub of one " + e);
        System.out.println( "d value sub of one " + d);
        /*c, d փոփոխականները վերագրում ենք այլ e, f փոփոխականների նենց, որ e-ն ու f-ը ընդունեն c-ի ու d-ի մինչև վերագրումն ունեցած արժեքները,
        իսկ assignment-ի statement-ից հետո c-ի ու d-ի արժեքները մեկով պակասեն*/
        int h = 899625605;
        int k = 15;
        long n = (int)  h;
        long m = (int) k;
        long j = n * m;
        System.out.println( j );



    }
}