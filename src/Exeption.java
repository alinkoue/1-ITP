import java.io.*;
public class Exeption {
    public static void main(String[] args) {
        try(FileInputStream in = new FileInputStream("C:\\Users\\Alina\\IdeaProjects\\first_try\\src\\input.txt");
            FileOutputStream out = new FileOutputStream("C:\\Users\\Alina\\IdeaProjects\\first_try\\src\\output.txt"))
        {
            byte[] buffer = new byte[in.available()];
            in.read(buffer, 0, buffer.length);
            out.write(buffer, 0, buffer.length);
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
