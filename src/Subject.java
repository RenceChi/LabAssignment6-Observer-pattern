//This defines the operations for managing the list of subscribers and notifying them.
public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifySubscribers();
}