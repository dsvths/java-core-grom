package lesson10.abstractfirstexample;

/**
 * Created by Savenko on 18.06.2017.
 */
public class MySQLProvider extends DbProvider{

    //public MySQLProvider(String dbHost) {
    //    super(dbHost);
    //}

    @Override
    void connectToDb() {
        //logic for Mysql
    }

    @Override
    void disconnectFromDb(){
        //logic for MySQL
    }
}
