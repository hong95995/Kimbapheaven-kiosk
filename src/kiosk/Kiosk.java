package kiosk;

import java.util.Scanner;

public class Kiosk {
    final int quantityMax = 99;
    Scanner scanner = new Scanner(System.in);
    public void start() {

        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("------------------------------");

        Product selectedProduct = selectMenu();

        int quantity = inputQuantity();

        int totalPrice = quantity * selectedProduct.getProductPrice();

        System.out.printf("[안내]주문하신 메뉴의 총 금액은 %d원 입니다.%n", totalPrice);
        System.out.println("[안내]이용해 주셔서 감사합니다.");

    }

    public Product selectMenu() {

        Menu menu = new Menu();

        System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
        menu.printMenu();

        int input = Integer.parseInt(scanner.nextLine());
        if (input >= 1 && input <= menu.getAllProduct().length) {
            return menu.getAllProduct()[input - 1];
        }
        else {
            System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.");
            System.out.println("");
            return selectMenu();
        }
    }

    public int inputQuantity() {
        System.out.println("------------------------------");
        System.out.println("[안내]선택하신 메뉴의 수량을 입력하여 주세요.");
        System.out.println("(※ 최대 주문 가능 수량 : " + quantityMax + ")");

        int input = Integer.parseInt(scanner.nextLine());

        if (input > quantityMax) return inputQuantity();
        else return input;
    }
}
