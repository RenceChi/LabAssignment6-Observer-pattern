import java.util.ArrayList;
import java.util.List;

/**
 * Represents the central hub for publishing news.
 * It maintains the state (news) and the list of subscribers.
 */
public class NewsAgency implements Subject {
    private List<Observer> subscribers;
    private String breakingNews;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
        // We can cast to our concrete implementation to get the name for the log or just log that a new subscriber joined.
        System.out.println("LOG: A new subscriber has joined the service.");
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
        System.out.println("LOG: A subscriber has left the service.");
    }

    @Override
    public void notifySubscribers() {
        for (Observer observer : subscribers) {
            observer.update(breakingNews);
        }
    }

    /**
     * This method simulates the agency publishing new content.
     * When the state changes (new news), it triggers the notification.
     */
    public void publishNews(String news) {
        this.breakingNews = news;
        System.out.println("\n--- [NewsAgency] Publishing: " + news + " ---");
        notifySubscribers();
    }
}