package tk.gushizone.design.principle.ocp;

import java.math.BigDecimal;

/**
 * @author gushizone@gmail.com
 * @date 2022/4/28 14:44
 */
public class ConsumerGoods implements Goods {

    private Integer Id;

    private String name;

    private BigDecimal price;

    public ConsumerGoods(Integer id, String name, BigDecimal price) {
        this.Id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return Id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }
}
