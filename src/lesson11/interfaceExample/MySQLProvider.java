package lesson11.interfaceExample;

/**
 * Created by Savenko on 18.06.2017.
 */
public class MySQLProvider implements DbProvider {

    //public MySQLProvider(String dbHost) {
    //    super(dbHost);
    //}


    @Override
    public void connectToDb() {
        //some logic for MySQL
    }

    @Override
    public void disconnectFromDb() {
        //some logic for MySQL
    }

    @Override
    public void encryptData() {
        //some logic for MySQL
    }
}
