package tk.gushizone.design.principle.crp;

/**
 * @author gushizone@gmail.com
 * @date 2022/6/9 16:53
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
