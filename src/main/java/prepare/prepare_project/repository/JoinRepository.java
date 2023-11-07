package prepare.prepare_project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import prepare.prepare_project.entity.JoinEntity;

import java.util.Optional;

public interface JoinRepository extends JpaRepository<JoinEntity, Long> {

    Optional<JoinEntity> findByMemberId(String memberId);
}
