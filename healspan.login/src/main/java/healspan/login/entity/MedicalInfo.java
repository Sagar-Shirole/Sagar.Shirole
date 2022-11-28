package healspan.login.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="patient_medical_info" , schema="Healspan")
public class MedicalInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pmi_id", unique = true)
    private Long patientMedicalId;

    @Column(name = "pmi_pi_id", unique = true)
    private Long patientInformationId;

    @Column(name = "pmi_dm_id", unique = true)
    private Long diagnosisMasterId;

    @Column(name = "pmi_dsm_id", unique = true)
    private Long dsmId;

    @Column(name = "pmi_first_diagnosis_date", unique = true)
    private LocalDateTime firstDiagnosisDate;

    @Column(name = "pmi_cmi_id", unique = true)
    private Long cmiId;

    @Column(name = "pmi_treating_doctor", unique = true)
    private String doctorName;

    @Column(name = "pmi_doctor_registration_no", unique = true)
    private Long doctorRegNumber;

    @Column(name = "pmi_treating_doctor_qualification", unique = true)
    private Long docQualification;

    public MedicalInfo() {
    }

    public MedicalInfo(Long patientMedicalId, Long patientInformationId, Long diagnosisMasterId, Long dsmId, LocalDateTime firstDiagnosisDate, Long cmiId, String doctorName, Long doctorRegNumber, Long docQualification) {
        this.patientMedicalId = patientMedicalId;
        this.patientInformationId = patientInformationId;
        this.diagnosisMasterId = diagnosisMasterId;
        this.dsmId = dsmId;
        this.firstDiagnosisDate = firstDiagnosisDate;
        this.cmiId = cmiId;
        this.doctorName = doctorName;
        this.doctorRegNumber = doctorRegNumber;
        this.docQualification = docQualification;
    }

    public Long getPatientMedicalId() {
        return patientMedicalId;
    }

    public void setPatientMedicalId(Long patientMedicalId) {
        this.patientMedicalId = patientMedicalId;
    }

    public Long getPatientInformationId() {
        return patientInformationId;
    }

    public void setPatientInformationId(Long patientInformationId) {
        this.patientInformationId = patientInformationId;
    }

    public Long getDiagnosisMasterId() {
        return diagnosisMasterId;
    }

    public void setDiagnosisMasterId(Long diagnosisMasterId) {
        this.diagnosisMasterId = diagnosisMasterId;
    }

    public Long getDsmId() {
        return dsmId;
    }

    public void setDsmId(Long dSMId) {
        this.dsmId = dsmId;
    }

    public LocalDateTime getFirstDiagnosisDate() {
        return firstDiagnosisDate;
    }

    public void setFirstDiagnosisDate(LocalDateTime firstDiagnosisDate) {
        this.firstDiagnosisDate = firstDiagnosisDate;
    }

    public Long getCmiId() {
        return cmiId;
    }

    public void setCmiId(Long cmiId) {
        this.cmiId = cmiId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Long getDoctorRegNumber() {
        return doctorRegNumber;
    }

    public void setDoctorRegNumber(Long doctorRegNumber) {
        this.doctorRegNumber = doctorRegNumber;
    }

    public Long getDocQualification() {
        return docQualification;
    }

    public void setDocQualification(Long docQualification) {
        this.docQualification = docQualification;
    }
}

