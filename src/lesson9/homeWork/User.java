package lesson9.homeWork;

/**
 * Created by DSV_Discovery on 15.06.2017.
 */
public class User {

    long id;
    String name;
    String sessionId;

    public User(long id, String name, String sessionId) {
        this.id = id;
        this.name = name;
        this.sessionId = sessionId;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSessionId() {
        return sessionId;
    }
}
