package Main.patterns.behavioral.pubsub.task.pubsub;

public interface Publisher {
    void registerUser(Subscriber subscriber);

    void removeUser(Subscriber subscriber);

    void notifyUsers(String msg, Video video);
}
