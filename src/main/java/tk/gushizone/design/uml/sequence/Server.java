package tk.gushizone.design.uml.sequence;

/**
 * @author gushizone@gmail.com
 * @date 2021/6/20 5:52 下午
 */
public class Server {

    private final Device device = new Device();

    public void open() {
        System.out.println("open..");
    }

    public void print(String data) {
        device.write(data);
    }

    public void close() {
        System.out.println("close");
    }
}
