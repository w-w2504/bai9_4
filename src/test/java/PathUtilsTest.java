import org.junit.jupiter.api.Test;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PathUtilsTest {
    @Test
    public void testBuildPath() {
        // Paths.get() sinh ra đường dẫn đúng với hệ điều hành đang chạy
        String expectedPath = Paths.get("logs", "error.log").toString();

        // Hàm của ta luôn sinh ra kiểu Windows: logs\error.log
        String actualPath = PathUtils.buildPath("logs", "error.log");

        assertEquals(expectedPath, actualPath, "Lỗi: Đường dẫn không tương thích hệ điều hành!");
    }
}