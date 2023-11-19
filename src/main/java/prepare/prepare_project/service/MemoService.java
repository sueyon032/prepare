package prepare.prepare_project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import prepare.prepare_project.dto.MemoDTO;
import prepare.prepare_project.entity.CountryInfoEntity;
import prepare.prepare_project.entity.JoinEntity;
import prepare.prepare_project.entity.MemoEntity;
import prepare.prepare_project.repository.MemoRepository;

import java.util.List;

@Service //스프링이 관리해주는 객체 == 스프링 빈
@RequiredArgsConstructor
public class MemoService {
    private final MemoRepository memoRepository;

    public void save(MemoDTO memoDTO){
        MemoEntity memoEntity = MemoEntity.toMemoEntity(memoDTO);
        memoRepository.save(memoEntity);
    }

    public List<MemoEntity> getAllMemo() {
        return memoRepository.findAll();
    }
}
