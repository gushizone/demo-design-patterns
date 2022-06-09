package tk.gushizone.design.principle.crp;

/**
 * @author gushizone@gmail.com
 * @date 2022/6/9 16:54
 */
public class CrpTest {

    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
//        productDao.setDbConnection(new MySQLConnection());
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
