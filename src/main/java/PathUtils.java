public class PathUtils {
    public static String buildPath(String folder, String file) {
        // Dùng định dạng cứng của Windows (gạch chéo ngược)
        return folder + "\\" + file;
    }
}