package prepare.prepare_project.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import prepare.prepare_project.entity.MemoEntity;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MemoDTO {
    private Long id;
    private String text1;
    private String text2;
    private String text3;

    public static MemoDTO toMemoDTO(MemoEntity memoEntity){
        MemoDTO memoDTO= new MemoDTO();
        memoDTO.setId(memoEntity.getId());
        memoDTO.setText1(memoEntity.getText1());
        memoDTO.setText2(memoEntity.getText2());
        memoDTO.setText3(memoEntity.getText3());
        return memoDTO;
    }
}
