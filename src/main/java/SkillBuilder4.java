
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {

    private static final int START = 0;
    private static final int FINDMATCH = 1;
    private static final int FOUNDMATCH = 2;


    public static String findTYPattern(String s) {
        int state = START;
        int startIndex = -1;

        for (int i = 0; i < s.length(); i++) {
            char thisChar = s.charAt(i);

            switch (state){
                case START:
                    if (thisChar == 't' || thisChar == 'T'){
                    startIndex = i;
                    state = FINDMATCH;
                    }
                    break;

                case FINDMATCH:
                    if (thisChar == 'y' || thisChar == 'Y'){
                        state = FOUNDMATCH;
                    }
                    break;

                case FOUNDMATCH:
                    return s.substring(startIndex, i);
            }
        }
        return "";
    }
}
