package healspan.login.service;

import healspan.login.entity.MedicalInfo;
import healspan.login.repository.MedicalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicalInfoService {

    @Autowired
    private MedicalInfoRepository medicalInfoRepository;

    //insert patient details
    public void addMedicalInfo(MedicalInfo medicalInfo) {
        medicalInfoRepository.save(medicalInfo);
    }
    public List<MedicalInfo> getAllMedicalInfo() {
        List<MedicalInfo> medicalInfo = new ArrayList<>();
        medicalInfo = medicalInfoRepository.findAll();
        return medicalInfo;
    }
}