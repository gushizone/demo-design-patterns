package tk.gushizone.design.principle.crp;

/**
 *
 * @author gushizone@gmail.com
 * @date 2022/6/9 16:53
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
