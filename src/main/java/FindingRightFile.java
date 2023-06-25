
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FindingRightFile {
    public StringBuffer textFilesOutput(String text, int numOfDigits) {
        StringBuffer output = new StringBuffer();

        Pattern pattern = Pattern.compile("[a-zA-Z]+\\d{" + numOfDigits + "}\\.(doc|txt|docx|odb)");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            output.append(matcher.group() + " ");
        }

        return output;
    }

    public static void main(String[] args) {
        String text = "docum12.doc dsda.pdf fdsfdsfsd1.txt fdsfsdfds dsd43.txt";
        int numOfDigits = 2;
        FindingRightFile file = new FindingRightFile();
        System.out.println(file.textFilesOutput(text, numOfDigits));

    }

}

