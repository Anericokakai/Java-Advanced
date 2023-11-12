package Abstraction;

import java.util.regex.Pattern;

public class ReadPhoneNumbers  extends FileReader{
    private static  final    Pattern  PATTERN=Pattern.compile("^[0-9]*$");
    @Override

    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "phone number";
    }
}
