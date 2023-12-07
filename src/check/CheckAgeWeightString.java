package check;

public class CheckAgeWeightString {
    public static Integer convertWeightIntString(String str){
        try {
            Integer weightInt = Integer.parseInt(str);
            if (weightInt < 0 || weightInt >= 22){
                return null;
            }
            return weightInt;
        } catch (NumberFormatException ignore){
            return null;
        }
    }
}
