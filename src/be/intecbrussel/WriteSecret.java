package be.intecbrussel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Secret {

   public static void writeSecret() {

       Path path = Path.of("./Secret_Folder/Secret_Message.txt");

       try {
           Files.createDirectories(path.getParent());
       }
       catch (IOException ioException) {
           ioException.printStackTrace();
       }

       try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path.toFile()))){
           bufferedWriter.write("The wolf is in the pig pen. I repeat: the wolf is in the pig pen.");
       }
   }
}
