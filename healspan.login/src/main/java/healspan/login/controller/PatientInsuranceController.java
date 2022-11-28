package healspan.login.controller;

import healspan.login.entity.Patient;
import healspan.login.entity.PatientInsurance;
import healspan.login.repository.PatientInsuranceRepository;
import healspan.login.service.PatientInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientInsuranceController {

    @Autowired
    private PatientInsuranceService patientInsuranceService;

    @Autowired
    private PatientInsuranceRepository patientInsuranceRepository;
    public String addGroupName(){


        return null;
    }

    //Insert Data
    @RequestMapping(value = "/insertInsurance", method= RequestMethod.POST, produces = "application/json")
    public ResponseEntity<String> addInsurance(@RequestBody PatientInsurance insurance) {
        if(insurance.isGroupPolicy() == true){
//            patientInsuranceRepository.addGroupName();
//            patientInsuranceRepository.addclaimId();
        }
        patientInsuranceService.addInsurance(insurance);
        return new ResponseEntity<>("Data Inserted Successfully " , HttpStatus.OK);
    }

    //Get All Details
    @GetMapping("/insurance")
    private List<PatientInsurance> getAllInsurances() {
        return patientInsuranceService.getAllInsurance();
    }

}