import java.io.*;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) throws IOException {
        int result=0;
        InputStream in=null;
        try {
            in=new FileInputStream("src/main/numbers.txt");
            Scanner scanner=new Scanner(in);
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            result=a+b;
            System.out.println(result);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            in.close();
        }
        FileWriter fileWriter=new FileWriter("src/main/result.txt");
        fileWriter.write(result+"");
        fileWriter.flush();
    }
}
