public class NotificationService {
	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = (Notification) notificationFactory.createNotification("EMAIL");
		notification.notifyUser();
		
		Notification notification1 = (Notification) notificationFactory.createNotification("SMS");
		notification1.notifyUser();
		
		Notification notification2 = notificationFactory.createNotification("PUSH");
		notification2.notifyUser();
		
	}
}
