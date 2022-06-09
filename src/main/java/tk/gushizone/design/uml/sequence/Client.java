package tk.gushizone.design.uml.sequence;

/**
 * @author gushizone@gmail.com
 * @date 2021/6/20 5:53 下午
 */
public class Client {

    private final Server server = new Server();

    public void work() {
        server.open();
        server.print("hello");
        server.close();
    }

}
