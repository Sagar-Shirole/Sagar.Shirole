package healspan.login.service;

import healspan.login.entity.Patient;
import healspan.login.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    //insert patient details
    public void addPatient(Patient patient) {
     patientRepository.save(patient);
    }

    public List<Patient> getAllPatient() {
        List<Patient> patient = new ArrayList<>();
        patientRepository.findAll().forEach(patient1 -> patient.add(patient1));
        return patient;
    }

    public void updatePatient(Patient patient) {
        Optional<Patient> resultPatient = patientRepository.findById(patient.getPatientId());
        if(resultPatient.isEmpty()){
          throw new RuntimeException("Patient Not Found");
        }
        patientRepository.save(patient);

    }
}