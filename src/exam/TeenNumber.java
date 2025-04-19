package exam;

public class TeenNumber {

    public static boolean isExactingTeenNum(int a, int b){

        boolean result = (a > 10 && a <20);
        boolean bResult = (b > 10 && b <20);

        return result != bResult;
    }

    public static void main(String[] args) {
        System.out.println(isExactingTeenNum(13,99));
        System.out.println(isExactingTeenNum(21,19));
        System.out.println(isExactingTeenNum(13,13));
        System.out.println(isExactingTeenNum(99,99));
    }
}