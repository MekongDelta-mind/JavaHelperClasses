/**
 * A console application that tests the UnzipUtility class
 *
 * @author www.codejava.net
 *
 * Refer to <a href="https://www.codejava.net/java-se/file-io/programmatically-extract-a-zip-file-using-java">Source code of a test class</a> 
 */
public class UnzipUtilityTest {
    public static void main(String[] args) {
        String zipFilePath = "e:/Test/MyPics.zip";
        String destDirectory = "f:/Pics";
        UnzipUtility unzipper = new UnzipUtility();
        try {
            unzipper.unzip(zipFilePath, destDirectory);
        } catch (Exception ex) {
            // some errors occurred
            ex.printStackTrace();
        }
    }
}
