package healspan.login.repository;

import healspan.login.entity.Patient;
import healspan.login.entity.PatientInsurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientInsuranceRepository extends JpaRepository<PatientInsurance , Long> {
}
