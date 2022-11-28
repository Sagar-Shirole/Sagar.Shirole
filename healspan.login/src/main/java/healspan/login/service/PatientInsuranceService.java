package healspan.login.service;

import healspan.login.entity.Patient;
import healspan.login.entity.PatientInsurance;
import healspan.login.repository.PatientInsuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientInsuranceService {

    @Autowired
    private PatientInsuranceRepository patientInsuranceRepository;

    //insert patient details
    public void addInsurance(PatientInsurance insurance) {
        patientInsuranceRepository.save(insurance);
    }

    public List<PatientInsurance> getAllInsurance() {
        List<PatientInsurance> insurance = new ArrayList<>();
        patientInsuranceRepository.findAll().forEach(insurance1 -> insurance.add(insurance1));
        return insurance;
    }
}
