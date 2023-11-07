package prepare.prepare_project.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import prepare.prepare_project.dto.JoinDTO;

@Entity
@Setter
@Getter
@Table(name = "member_table") //database에 해당 이름의 테이블 생성
public class JoinEntity { //table 역할
    //jpa ==> database를 객체처럼 사용 가능

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(unique = true)
    private String memberId;

    @Column
    private String memberPw;
    public static JoinEntity toJoinEntity(JoinDTO joinDTO){
        JoinEntity joinEntity = new JoinEntity();
        joinEntity.setId(joinDTO.getId());
        joinEntity.setMemberId(joinDTO.getMemberId());
        joinEntity.setMemberPw(joinDTO.getMemberPw());
        return joinEntity;
    }

}