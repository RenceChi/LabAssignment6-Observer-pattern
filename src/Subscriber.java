//Represents a user or entity.
 class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        // This is the immediate notification handling
        System.out.println("Preferred News Feed for [" + name + "]: " + news);
    }
}