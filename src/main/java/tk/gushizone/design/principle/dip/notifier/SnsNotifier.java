package tk.gushizone.design.principle.dip.notifier;

/**
 * @author gushizone@gmail.com
 * @date 2022/4/28 16:20
 */
public class SnsNotifier implements Notifier{

    @Override
    public void sendNotify(String message) {
        System.out.println("SNS: " + message);
    }
}
