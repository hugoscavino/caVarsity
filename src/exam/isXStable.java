package exam;

public class isXStable {

    public static boolean isStable(String phrase) {

        int xPos = 0;
        char[] chars = phrase.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'x') {
                xPos = i;
            }
        }

        if (xPos == 0){
            return false;
        }
        int yPos = phrase.indexOf('y');

        return xPos < yPos;
    }
    public static void main(String[] args) {
        System.out.println(isStable("aaxbby"));
        System.out.println(isStable("aaxbb"));
        System.out.println(isStable("yaaxbb"));
    }
}
