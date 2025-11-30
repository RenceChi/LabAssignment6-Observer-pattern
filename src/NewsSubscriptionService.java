public class NewsSubscriptionService {
    public static void main(String[] args) {
        // Create the Subject (NewsAgency)
        NewsAgency bbcNews = new NewsAgency();

        // Create Observers (Subscribers)
        Subscriber user1 = new Subscriber("Alice");
        Subscriber user2 = new Subscriber("Bob");
        Subscriber user3 = new Subscriber("Charlie");

        //Register subscribers (Subscription Management)
        bbcNews.subscribe(user1);
        bbcNews.subscribe(user2);

        //notify all
        bbcNews.publishNews("Tech stocks hit an all-time high!");

        //Add a new user mid-stream(Dynamic Subscription)
        bbcNews.subscribe(user3);

        //Publish more news
        bbcNews.publishNews("New Java version released!");

        //Unsubscribe a user (Dynamic Updates)
        bbcNews.unsubscribe(user1); // Alice leaves

        //Publish final news to remaining subscribers
        bbcNews.publishNews("Weather Alert: Heavy rain expected tomorrow.");
    }
}