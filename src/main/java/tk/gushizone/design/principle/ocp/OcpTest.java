package tk.gushizone.design.principle.ocp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 开闭原则：对扩展开放，对修改关闭
 * 例如：之前已经定义了通用的功能/属性接口，现在需要添加新的功能/属性，不能直接改原代码，而是扩展原有接口
 *
 * @author gushizone@gmail.com
 * @date 2022/4/28 14:45
 */
public class OcpTest {


    public static void main(String[] args) {

        List<Goods> goodsList = new ArrayList<>();

        goodsList.add(new ConsumerGoods(1, "牙刷", new BigDecimal("5.9")));
        goodsList.add(new ConsumerGoods(2, "牙膏", new BigDecimal("9.9")));
        goodsList.add(new ConsumerDiscountGoods(3, "洁面膏", new BigDecimal("59.9")));


        for (Goods goods : goodsList) {

            System.out.print("ID: " + goods.getId() + "  名称: " + goods.getName());
            if (goods instanceof DiscountGoods) {

                DiscountGoods discountGoods = (DiscountGoods) goods;
                System.out.println("  原价: " + discountGoods.getPrice() + "  折扣价: " + discountGoods.getDiscountPrice());
            } else {
                System.out.println("  价格: " + goods.getPrice());
            }
        }
    }
}
