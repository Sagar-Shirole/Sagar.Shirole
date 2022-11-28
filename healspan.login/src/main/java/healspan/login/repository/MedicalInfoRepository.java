package healspan.login.repository;

import healspan.login.entity.MedicalInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalInfoRepository extends JpaRepository<MedicalInfo , Long>{


}

