import java.nio.file.Paths;

public class PathUtils {
    public static String buildPath(String folder, String file) {
        // Tái cấu trúc: Sử dụng API java.nio.file.Path để tự động tương thích mọi hệ điều hành
        return Paths.get(folder, file).toString();
    }
}