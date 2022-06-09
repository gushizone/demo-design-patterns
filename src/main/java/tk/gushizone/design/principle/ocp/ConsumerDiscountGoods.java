package tk.gushizone.design.principle.ocp;

import java.math.BigDecimal;

/**
 * @author gushizone@gmail.com
 * @date 2022/4/28 14:45
 */
public class ConsumerDiscountGoods extends ConsumerGoods implements DiscountGoods {


    public ConsumerDiscountGoods(Integer id, String name, BigDecimal price) {
        super(id, name, price);
    }

    @Override
    public BigDecimal getDiscountPrice() {
        return super.getPrice().multiply(new BigDecimal("0.8"));
    }

}
