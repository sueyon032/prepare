package prepare.prepare_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prepare.prepare_project.entity.JoinEntity;

@Repository
public interface JoinRepository extends JpaRepository<JoinEntity, Long> {}
