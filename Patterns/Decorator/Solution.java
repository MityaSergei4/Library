public class Solution {
    public static void main(String[] args){
        Product milk = new Milk(50);

        Product milkDiscount = new MilkDiscount(milk);
        // Product milkDiscount = new MilkDiscount(new MilkDiscount(milk)); / 75%

        System.out.println(milkDiscount.getPrice());
    }
}
