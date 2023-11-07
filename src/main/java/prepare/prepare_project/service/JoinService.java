package prepare.prepare_project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import prepare.prepare_project.dto.JoinDTO;
import prepare.prepare_project.entity.JoinEntity;
import prepare.prepare_project.repository.JoinRepository;

import java.util.Optional;

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

    public JoinDTO login(JoinDTO joinDTO){ //entity객체는 service에서만
        Optional<JoinEntity> byMemberId = joinRepository.findByMemberId(joinDTO.getMemberId());
        if(byMemberId.isPresent()){
            // 조회 결과가 있다
            JoinEntity joinEntity = byMemberId.get(); // Optional에서 꺼냄
            if(joinEntity.getMemberPw().equals(joinDTO.getMemberPw())) {
                //비밀번호 일치
                //entity -> dto 변환 후 리턴
                JoinDTO dto = JoinDTO.toJoinDTO(joinEntity);
                return dto;
            } else {
                //비밀번호 불일치
                return null;
            }
        } else {
            // 조회 결과가 없다
            return null;
        }
    }
}
