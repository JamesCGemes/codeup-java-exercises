package fileIo;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    private String directoryName; // data
    private String fileName;
    private String logFileName;  // store what went right or wrong
    private Path directoryPath;  //represents path of the parent directory
    private Path filePath; //Path represent the file itself.
    private Path logFilePath; //Path representation for the log file

    private List<String> fileLines; //Holding spot for the content of the data file.
    private List<String> LogFileLines; //hold spot for contents of the logfile

    //Contructors
    public FileReader(String directoryName, String fileName, String logFileName){
        this.directoryName = directoryName;
        this.fileName = fileName;
        this.logFileName = logFileName;
        // Instantiation Path values.
        this.directoryPath = Paths.get(directoryName); // Paths.get("data")
        this.filePath = Paths.get(directoryName, fileName);
        this.logFilePath = Paths.get(directoryName, logFileName);


        //Check for files, if they dont exist then we will create them.
        //Log file first the data file
        //Log file
        if(Files.notExists(this.logFilePath)){
            try {
                Files.createFile(this.logFilePath);
            }catch (IOException e){
                //store exception message in the log file
                throw new IOException("Unable to create the log file(" + this.logFileName + ")");
            }

        }

        System.out.println(filePath);
    }

    public static void main(String[] args) throws IOException {
        FileReader thisFileReader = new FileReader("data", "day18.txt", "day18.log");


        FileReader joltsReader = new FileReader("src/fileIo", "jolts.txt", "jolts.log");
    }
    //Custom methods

    //Getters and settters
    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLogFileName() {
        return logFileName;
    }

    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    public Path getDirectoryPath() {
        return directoryPath;
    }

    public void setDirectoryPath(Path directoryPath) {
        this.directoryPath = directoryPath;
    }

    public Path getFilePath() {
        return filePath;
    }

    public void setFilePath(Path filePath) {
        this.filePath = filePath;
    }

    public Path getLogFilePath() {
        return logFilePath;
    }

    public void setLogFilePath(Path logFilePath) {
        this.logFilePath = logFilePath;
    }

    public List<String> getFileLines() {
        return fileLines;
    }

    public void setFileLines(List<String> fileLines) {
        this.fileLines = fileLines;
    }

    public List<String> getLogFileLines() {
        return LogFileLines;
    }

    public void setLogFileLines(List<String> logFileLines) {
        LogFileLines = logFileLines;
    }
}