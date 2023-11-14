package prepare.prepare_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import prepare.prepare_project.entity.CountryInfoEntity;

public interface CountryInfoRepository extends JpaRepository<CountryInfoEntity, Long> {
    // 필요한 데이터베이스 쿼리를 정의할 수 있음
}

