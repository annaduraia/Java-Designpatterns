public class NotificationService {
	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = (Notification) notificationFactory.createNotification("EMAIL");
		notification.notifyUser();
	}
}
