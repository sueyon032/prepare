package prepare.prepare_project.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import prepare.prepare_project.dto.MemoDTO;

@Entity
@Setter
@Getter
@Table(name = "memo_table") //database에 해당 이름의 테이블 생성
public class MemoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column
    private String text1;

    @Column
    private String text2;

    @Column
    private String text3;

    public static MemoEntity toMemoEntity(MemoDTO memoDTO) {
        MemoEntity memoEntity = new MemoEntity();
        memoEntity.setId(memoDTO.getId());
        memoEntity.setText1(memoDTO.getText1());
        memoEntity.setText2(memoDTO.getText2());
        memoEntity.setText3(memoDTO.getText3());
        return memoEntity;
    }


}
