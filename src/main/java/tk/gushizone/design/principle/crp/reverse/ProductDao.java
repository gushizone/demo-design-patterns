package tk.gushizone.design.principle.crp.reverse;

/**
 *
 * @author gushizone@gmail.com
 * @date 2022/6/9 16:53
 */
public class ProductDao extends DBConnection{

    public void addProduct(){
        String conn = getConnection();
        System.out.println("使用"+conn+"增加产品");
    }
}
