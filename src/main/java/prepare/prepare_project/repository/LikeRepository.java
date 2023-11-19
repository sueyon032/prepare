package prepare.prepare_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prepare.prepare_project.entity.JoinEntity;
import prepare.prepare_project.entity.LikeEntity;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<LikeEntity, Long> {

    List<LikeEntity> findByJoinEntity(JoinEntity joinEntity);
}
