public class LogLevels {
    
    public static String message(String logLine) {
        String lines[] = logLine.split(":");
        lines[1] = lines[1].trim();
        return lines[1];
    }
    
    public static String logLevel(String logLine) {
        String lines[] = logLine.split(":");
        lines[0] = lines[0].replaceAll("[\\[\\]]","").toLowerCase();
        return lines[0];
    }

    public static String reformat(String logLine) {
        return message(logLine)+" (" + logLevel(logLine) + ")";
    }

}
