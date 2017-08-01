package webinar2;

/**
 * Created by Savenko on 29.07.2017.
 */
public class Solution {

    // проверка адреса на null и пустую строку ""
    // допустимые протоколы http & https
    // www не обязательно
    // доменная зона должна разделяться точкой, допустимые com, org, net
    // другие точки в адресе и спецсимволы не допускаются

    public boolean validate (String address) {

        if (address == null || address.isEmpty())
            return false;

        //String[] parts = address.split()

        address = address.trim(); // обрезаем пробелы после адреса

        if (!address.startsWith("http://") && !address.startsWith("https://"))
            return false;

        if (!address.endsWith(".com") && !address.endsWith(".net") && !address.endsWith(".org"))
            return false;

        address = address.replaceAll("www.", ""); //www не обязательно

        //get body
        address = address.replaceAll("http://", "");
        address = address.replaceAll("https://", "");
        address = address.replaceAll(".com", "");
        address = address.replaceAll(".net", "");
        address = address.replaceAll(".org", "");

        return check(address);
    }
    private boolean check(String body){
        char[] chars = body.toCharArray();

        for (char c : chars) {
            if (!Character.isLetterOrDigit(c))
                return false;
        }
        return true;
    }
}
