package check;

public class CheckWeightString {
    public static Integer ConvertWeigntString(String str){
        try {
            Integer WeightInt = Integer.parseInt(str);
            if (WeightInt < 0 || WeightInt >= 20){
                return null;
            }
            return WeightInt;
        } catch (NumberFormatException ignore){
            return null;
        }
    }
}
