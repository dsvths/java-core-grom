package lesson9.utils;

/**
 * Created by DSV_Discovery on 14.06.2017.
 */
public class Checker {
    //public
    //private
    //default (package-private)
    //protected

    //private
    //default (package-private)
    //protected
    //public

    int companyNamesValidatedCount = 0;

    public boolean checkCompanyName(String companyName){
     //   if (companyName == "Goggle" || companyName == "Amazon" )
     //       return false;
     //   return true;
        if (companyNamesValidatedCount > 10)
            return false;

        companyNamesValidatedCount++;
        return companyName != "Google" && companyName != "Amazon";
    }
}
