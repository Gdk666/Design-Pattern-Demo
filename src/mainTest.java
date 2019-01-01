import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mainTest {
    public static void main(String[] args) {
        List<String> nums = Arrays.asList("a","b");
        List<String> collect = nums.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
}
}
