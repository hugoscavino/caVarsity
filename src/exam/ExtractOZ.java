package exam;

public class ExtractOZ {
    public static String extract(String phrase) {

        if (phrase == null || phrase.length() < 3){
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder();

        if (phrase.charAt(0) == 'o') {
            sb.append(phrase.charAt(0));
        }
        if (phrase.charAt(1) == 'z') {
            sb.append(phrase.charAt(1));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(extract("ozzyosborne")); // should return "oz".
        System.out.println(extract ("bzoo"));        //should return "z".
        System.out.println(extract ("oxx"));        //should return "o".
        System.out.println(extract ("aaa"));        //should return ""
        extract (""); // triggers an IllegalArgumentException
    }
}
