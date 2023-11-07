package prepare.prepare_project.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import prepare.prepare_project.entity.JoinEntity;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class JoinDTO { //회원 정보를 필드로 정의
    private Long id;
    private String memberId;
    private String memberPw;

    public static JoinDTO toJoinDTO(JoinEntity joinEntity){
        JoinDTO joinDTO = new JoinDTO();
        joinDTO.setId(joinEntity.getId());
        joinDTO.setMemberId(joinEntity.getMemberId());
        joinDTO.setMemberPw(joinEntity.getMemberPw());

        return joinDTO;
    }
}