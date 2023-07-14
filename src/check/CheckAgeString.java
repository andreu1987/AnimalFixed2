package check;

public class CheckAgeString {

    public static Integer ConvertIntStr(String str){
        try {
           Integer ageInt = Integer.parseInt(str);
           if (ageInt < 0 || ageInt >=8){
               return null;
           }
           return ageInt;
        } catch (NumberFormatException ignore){
            return null;
        }
    }
}
