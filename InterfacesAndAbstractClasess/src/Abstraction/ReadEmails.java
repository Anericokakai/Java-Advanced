package Abstraction;

import java.util.regex.Pattern;

public class ReadEmails  extends FileReader{
    private  static  final  Pattern PATTERN= Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "emails file";
    }
}
