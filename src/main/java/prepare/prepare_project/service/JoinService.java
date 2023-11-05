package prepare.prepare_project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import prepare.prepare_project.dto.JoinDTO;
import prepare.prepare_project.entity.JoinEntity;
import prepare.prepare_project.repository.JoinRepository;

@Service //스프링이 관리해주는 객체 == 스프링 빈
@RequiredArgsConstructor //controller와 같이. final 멤버변수 생성자 만드는 역할
public class JoinService {

    private final JoinRepository joinRepository; // 먼저 jpa, mysql dependency 추가

    public void save(JoinDTO joinDTO) {
        // repsitory의 save 메서드 호출
        JoinEntity joinEntity = JoinEntity.toJoinEntity(joinDTO);
        joinRepository.save(joinEntity);
        //Repository의 save메서드 호출 (조건. entity객체를 넘겨줘야 함)

    }
}
