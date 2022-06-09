package tk.gushizone.design.principle.crp;

/**
 *
 * @author gushizone@gmail.com
 * @date 2022/6/9 16:53
 */
public class ProductDao{
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String conn = dbConnection.getConnection();
        System.out.println("使用"+conn+"增加产品");
    }
}
