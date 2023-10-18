package gdsc.backend.BootDemo;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Objects;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    private final List<DemoEntity> demoEntities = new ArrayList<>(Arrays.asList(
            new DemoEntity(1L, "1번"),
            new DemoEntity(2L, "2번"),
            new DemoEntity(3L, "3번")
    ));

    public List<DemoDto> getDemoEntities() {
        List<DemoDto> demoDtos = new ArrayList<>();
        for (DemoEntity demoEntity : demoEntities) {
            demoDtos.add(new DemoDto(demoEntity.getId(), demoEntity.getName()));
        }
        return demoDtos;
    }

    public DemoDto getDemoEntity(Long id) {
        for (DemoEntity demoEntity : demoEntities) {
            if (Objects.equals(id, demoEntity.getId())) {
                return new DemoDto(demoEntity.getId(), demoEntity.getName());
            }
        }
        return new DemoDto(-1L, "일치하는 id가 없습니다.");
    }

    public void addDemoEntity(DemoDto demoDto) {
        demoEntities.add(new DemoEntity(demoDto.getId(), demoDto.getName()));
    }
}
