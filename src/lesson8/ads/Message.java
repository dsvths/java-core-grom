package lesson8.ads;

import java.util.Date;

/**
 * Created by DSV_Discovery on 18.05.2017.
 */
public class Message extends BaseEntity{
    User userFrom;
    User userTo;
    Date dateSent;
    Date dateRead;
    String message;

    public Message(long id, User userFrom, User userTo, String message) {
        super(id);
        this.userFrom = userFrom;
        this.userTo = userTo;
        this.dateSent = new Date();
        this.message = message;
    }

    void setDateread() {
        dateRead = new Date();
    }

    boolean isRead() {
//        if (dateRead == null)
//            return false;
//        return true;
        return dateRead == null;
    }
}
