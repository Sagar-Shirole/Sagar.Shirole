package healspan.login.controller;

import healspan.login.entity.Patient;
import healspan.login.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    //Insert Data
    @RequestMapping(value = "/insert", method= RequestMethod.POST, produces = "application/json")
    public ResponseEntity<String> addPatient(@RequestBody Patient patient) {
        patientService.addPatient(patient);
        return new ResponseEntity<>("Data Inserted Successfully " , HttpStatus.OK);
    }

    @PutMapping(value = "/update", produces = "application/json")
    public ResponseEntity<String> updatePatient(@RequestBody Patient patient) {
        patientService.updatePatient(patient);
        return new ResponseEntity<>("Data Updated Successfully " , HttpStatus.OK);
    }

    //Get All Details
    @GetMapping("/patient")
    private List<Patient> getAllUser() {
        return patientService.getAllPatient();
    }
}