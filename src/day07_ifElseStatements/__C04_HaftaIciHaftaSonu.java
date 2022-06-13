package day07_ifElseStatements;

import java.util.Scanner;

public class __C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {

        // Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin

        String gun;

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir gün giriniz");
        gun=scan.next().toLowerCase();


        if (gun.equals("pazar") || gun.equals("cumartesi"))
            System.out.println("girdiğiniz gün, haftasonu");

        else{

            if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") ||
                    gun.equals("perşembe") || gun.equals("cuma"))
                System.out.println("girdiğiniz gün, haftaiçi");

            else{
                System.out.println("Son hakkın düzgün yaz");
                gun=scan.next().toLowerCase();
            }

            if (gun.equals("pazar") || gun.equals("cumartesi")){
                System.out.println("Aferin yazmayı öğrenmişsin bu arada girdiğin gün haftasonu");}

            else {

                if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") ||
                        gun.equals("perşembe") || gun.equals("cuma") ){
                    System.out.println("Aferin yazmayı öğrenmişsin bu arada girdiğin gün haftaiçi");
                }

                else {
                    System.out.println("günleri öğren öyle gel");
                }
            }


        }


        }
    }

