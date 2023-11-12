package Abstraction;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  abstract class FileReader {


public abstract   Pattern getPattern();
public abstract String getReportName();


String  out="";
    private  String  fileOperation() throws FileNotFoundException {
        File file= new File("src/Abstraction/text.txt");

        Scanner reader= new Scanner(file);
        if(reader.hasNextLine()){
            reader.nextLine();
        }else {
            return "empty file";
        }

        while (reader.hasNextLine()){
            String  nextLine= reader.nextLine();
            Matcher matcher= getPattern().matcher(nextLine);

            if(matcher.matches()){
                out+=nextLine +"\n";
            }
            
        }

        return "operation on the given file is done";



    }

    public  void printoutMesage() throws Exception{
fileOperation();
        System.out.println("the report compiled for "+ getReportName() +" is : "+ out);

    }
}
