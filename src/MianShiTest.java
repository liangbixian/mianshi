public class MianShiTest {
    //1.有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
    //现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
    //请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。

    public static int getFruit(int apple,int strawberry){
        return apple*Constant.APPLE_PRICE+strawberry*Constant.STRAWBERRY_PRICE;
    }

    //2、超市增加了一种水果芒果，其定价为 20 元/斤。
    //现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
    //请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
    public static int getFruit(int apple,int strawberry,int mango){
        return apple*Constant.APPLE_PRICE+strawberry*Constant.STRAWBERRY_PRICE+mango*Constant.MANGO_PRICE;
    }

    //3、超市做促销活动，草莓限时打 8 折。
    //现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
    //请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
    public static double getFruitDiscounts(int apple, int strawberry, int mango){
        return apple*Constant.APPLE_PRICE+strawberry*Constant.STRAWBERRY_PRICE*0.8+mango*Constant.MANGO_PRICE;
    }
    //4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
    //现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
    //请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
    public static double getFruitDiscountsPower(int apple, int strawberry, int mango){
        if(MianShiTest.getFruit(apple,strawberry,mango)>=100){
            return MianShiTest.getFruit(apple,strawberry,mango)-10;
        }else{
            return MianShiTest.getFruit(apple,strawberry,mango);
        }
    }

    public static void main(String[] args) {
        /*int sumPrice = MianShiTest.getFruit(10, 10);
        System.out.println(sumPrice);*/

        /*int sumPrice = MianShiTest.getFruit(10, 10,10);
        System.out.println(sumPrice);*/

        /*double discountsSumPrice = MianShiTest.getFruitDiscounts(10, 10,10);
        System.out.println(discountsSumPrice);*/

        double fruitDiscountsPower = MianShiTest.getFruitDiscountsPower(10, 10, 10);
        System.out.println(fruitDiscountsPower);
    }
}
