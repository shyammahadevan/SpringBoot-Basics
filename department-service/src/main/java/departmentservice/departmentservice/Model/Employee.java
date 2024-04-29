package departmentservice.departmentservice.Model;

import java.util.ArrayList;
import java.util.List;

public record Employee(Long id, Long departmentId, String name, int age, String position) {


}
