package ro.itschool.main;

import ro.itschool.pojo.SuperSport;
import ro.itschool.shop.Shop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner s = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Alegeti o optiune de mai jos: \n" +
                    "0. Iesire \n" +
                    "1. Arata-mi toate motocicletele SS \n" +
                    "2. Cumpara o motocicleta SS \n" +
                    "3. BuyBack motocicleta");
            choice = Integer.parseInt(s.nextLine());
            switch (choice) {
                case 0:
                    break;
                case 1:
                    shop.getAllSuperSports();
                    break;
                case 2:
                    System.out.println("Introduceti id-ul motocicletei ");
                    int id = Integer.parseInt(s.nextLine());
                    shop.buySuperSport(id);
                    break;
                case 3:
                    shop.buyBackSuperSport(readSuperSport(s));
                    break;
                default:
                    System.out.println("Not a valid option");
            }
        } while (choice != 0);


        s.close();
    }

    private static SuperSport readSuperSport(Scanner s) {
        SuperSport superSport = new SuperSport();
        System.out.println("Introduceti motocicleta:");
        System.out.println("Introduceti id:");
        superSport.setId(Integer.parseInt(s.nextLine()));
        System.out.println("Introduceti modelul:");
        superSport.setModel(s.nextLine());
        System.out.println("Introduceti fabricantul:");
        superSport.setManufacturer(s.nextLine());
        System.out.println("Introduceti pretul:");
        superSport.setPrice(Integer.parseInt(s.nextLine()));
        System.out.println("Introduceti anul fabricatiei:");
        superSport.setFabricationYear(Integer.parseInt(s.nextLine()));
        return superSport;
    }
}
