package Classwork_25.exceptions;

public class ThrowsException {
    public static void main(String[] args) throws Exception {
        //System.out.println(getSeason(12));
            getMethodCaller();

    }

    static String getSeason(int monthNumber){
        if (monthNumber<1 || monthNumber>=12){
            throw new IllegalArgumentException(String.format("month: %d is invalid, the number should be between 0 and 12",monthNumber));
        }

        if (monthNumber<3) return "winter";
        else if (monthNumber<6) return "spring";
        else if (monthNumber<9) return "summer";
        else if (monthNumber<12) return "autumn";
        else return "winter";
    }

    static void getMethodCaller() throws Exception {
        Exception e = new Exception("my message");
        //throw e;
        String className = e.getStackTrace()[1].getClassName();
        System.out.println(className);
        String methodName = e.getStackTrace()[1].getMethodName();
        System.out.println(methodName);
        int line = e.getStackTrace()[0].getLineNumber();
        System.out.println(line);
    }
}
