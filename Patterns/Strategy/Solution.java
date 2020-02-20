public class Solution {
    public static void main(String[] args) {
        String name = "Сыр 'Сливочный', ";
        double startPrice = 150;
        double halfPrice = new ControllerStrategy(new HalfStrategy()).getPrice(startPrice);
        // double salePrice = new ControllerStrategy(new SaleStrategy()).getPrice(startPrice);
        System.out.println(name + "\nЦена для пенсионеров: "+ halfPrice + "\nЦена во время акции: " + salePrice);
    }
}