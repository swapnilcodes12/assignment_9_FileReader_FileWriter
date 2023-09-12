import java.io.*;

public class Util {
    public static void ReplacementWithFileCopy(String srcFilePath, String destinationFilePath, String wordToReplace, String replacementWord) {
        try(
        FileReader srcFileReader = new FileReader(srcFilePath);
        BufferedReader srcBufferReader = new BufferedReader(srcFileReader);

        FileWriter destinationFileWriter = new FileWriter(destinationFilePath);) {

            String data;
            while ((data = srcBufferReader.readLine()) != null) {
                data = data.replaceAll(wordToReplace, replacementWord);
                destinationFileWriter.write(data + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
