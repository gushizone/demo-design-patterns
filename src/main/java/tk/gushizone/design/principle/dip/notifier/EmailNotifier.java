package tk.gushizone.design.principle.dip.notifier;

/**
 * @author gushizone@gmail.com
 * @date 2022/4/28 16:20
 */
public class EmailNotifier implements Notifier{

    @Override
    public void sendNotify(String message) {
        System.out.println("email: " + message);
    }
}
