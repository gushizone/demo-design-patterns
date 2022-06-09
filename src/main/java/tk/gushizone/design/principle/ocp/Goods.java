package tk.gushizone.design.principle.ocp;

import java.math.BigDecimal;

/**
 * @author gushizone@gmail.com
 * @date 2022/4/28 14:44
 */
public interface Goods {

    Integer getId();

    String getName();

    BigDecimal getPrice();
}
