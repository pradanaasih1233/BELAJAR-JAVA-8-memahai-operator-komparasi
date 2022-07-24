// OPERATOR KOMPARASI
// operator komparasi adalah operator yang digunakan untuk membandingkan dua nilai
// dan menghasilan nilai boolean
package com.belajar8;

public class main {
    public static void main(String[] args){
        // deklarasi
        int a = 10;
        int b = 22;
        boolean hasil;

        System.out.println("==================");
        System.out.println("OPERATOR KOMPARASI");
        System.out.println("==================");

        // jenis jenis operator komparasi

        //1. operator equal(persamaan)
        System.out.println("\n1. Operator Persamaan(equal)");
        System.out.println("--------------------------------------------------------------");
        hasil = a == b; // ini bermaksud membandingka nilai, apakah nilai a sama dengan b
        System.out.println("apakah " + a + " == " + b + " adalah " + hasil);

        //2. operator not equal(pertidakpersamaan)
        System.out.println("\n2. Operator Pertidaksamaan(not equal)");
        System.out.println("--------------------------------------------------------------");
        hasil = a != b; // ini bermaksud membandingka nilai, apakah nilai a tidak sama b
        System.out.println("apakah " + a + " != " + b + " adalah " + hasil);

        //3. operator less that(kurang dari)
        System.out.println("\n3. Operator Kurang dari(less that)");
        System.out.println("--------------------------------------------------------------");
        hasil = a < b; // ini bermaksud membandingka nilai, apakah nilai a kurang dari b
        System.out.println("apakah " + a + " < " + b + " adalah " + hasil);

        //4. operator greater that(lebih dari)
        System.out.println("\n4. Operator Lebih dari(greater that)");
        System.out.println("--------------------------------------------------------------");
        hasil = a > b; // ini bermaksud membandingka nilai, apakah nilai a lebih dari b
        System.out.println("apakah " + a + " > " + b + " adalah " + hasil);

        //5. operator less that equal(kurang dari sama dengan)
        System.out.println("\n5. Operator Kurang dari sama dengan(less that equal)");
        System.out.println("--------------------------------------------------------------");
        hasil = a <= b; // ini bermaksud membandingka nilai, apakah nilai a kurang dari sama dengan b
        System.out.println("apakah " + a + " <= " + b + " adalah " + hasil);

        //6. operator greater that equal(lebih dari sama dengan)
        System.out.println("\n6. Operator Lebih dari sama dengan(greater that equal)");
        System.out.println("--------------------------------------------------------------");
        hasil = a >= b; // ini bermaksud membandingka nilai, apakah nilai a lebih dari sama dengan b
        System.out.println("apakah " + a + " >= " + b + " adalah " + hasil);
    }
}
