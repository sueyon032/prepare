package prepare.prepare_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prepare.prepare_project.entity.MemoEntity;

public interface MemoRepository extends JpaRepository<MemoEntity, Long> {

}
