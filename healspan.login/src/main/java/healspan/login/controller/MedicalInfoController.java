package healspan.login.controller;

import healspan.login.entity.MedicalInfo;
import healspan.login.service.MedicalInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MedicalInfoController {

    Logger logger = LoggerFactory.getLogger(MedicalInfoController.class);
    @Autowired
    private MedicalInfoService medicalInfoService;

    //Insert Data
    @RequestMapping (value = "/insertMedicalInfo", method= RequestMethod.POST, produces = "application/json")
    public ResponseEntity<String> addMedicalInfo(@RequestBody MedicalInfo medicalInfo) {

        logger.info("Adding medical information for patient: {}", medicalInfo.getPatientMedicalId());

        medicalInfoService.addMedicalInfo(medicalInfo);
        logger.info("Added medical information for patient: {}", medicalInfo.getPatientMedicalId());
        return new ResponseEntity<>("Data Inserted Successfully " , HttpStatus.OK);
    }

    //Get All Details
    @GetMapping("/medical")
    private List<MedicalInfo> getAllMedicalInfo() {
        return medicalInfoService.getAllMedicalInfo();
    }
}
