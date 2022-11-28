package healspan.login.entity;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name = "patient_information", schema = "Healspan")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pi_id", unique = true)
    private Long patientId;
    @Column(name = "pi_hm_id", unique = true)
    private Long hospitalMasterId;
    @Column(name = "pi_mpm_id", unique = true)
    private Long medicalProcedureMasterId;
    @Column(name = "pi_first_name", unique = true)
    private String firstName;
    @Column(name = "pi_middle_name", unique = true)
    private String middleName;
    @Column(name = "pi_last_name", unique = true)
    private String lastName;
    @Column(name = "pi_gender", unique = true)
    private String gender;
    @Column(name = "pi_dob", unique = true)
    private Date dateOfBirth;
    @Column(name = "pi_age", unique = true)
    private Integer age;
    @Column(name = "pi_is_primary_insured", unique = true)
    private boolean isPrimaryInsured;
    @Column(name = "pi_mobile_no", unique = true)
    private Long mobileNumber;
    public Patient() {
    }
    public Patient(Long patientId, Long hospitalMasterId, Long medicalProcedureMasterId, String firstName, String middleName, String lastName, String gender, Date dateOfBirth, Integer age, boolean isPrimaryInsured, Long mobileNumber) {
        this.patientId = patientId;
        this.hospitalMasterId = hospitalMasterId;
        this.medicalProcedureMasterId = medicalProcedureMasterId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.isPrimaryInsured = isPrimaryInsured;
        this.mobileNumber = mobileNumber;
    }

    public Long getPatientId() {
        return patientId;
    }
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }
    public Long getHospitalMasterId() {
        return hospitalMasterId;
    }
    public void setHospitalMasterId(Long hospitalMasterId) {
        this.hospitalMasterId = hospitalMasterId;
    }
    public Long getMedicalProcedureMasterId() {
        return medicalProcedureMasterId;
    }
    public void setMedicalProcedureMasterId(Long medicalProcedureMasterId) {
        this.medicalProcedureMasterId = medicalProcedureMasterId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public boolean getIsPrimaryInsured() {
        return isPrimaryInsured;
    }
    public void setIsPrimaryInsured(boolean isPrimaryInsured) {
        this.isPrimaryInsured = isPrimaryInsured;
    }
    public Long getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    @Override
    public String toString() {
        return "Patient Information {" +
                ", FirstName='" + firstName + '\'' +
                ", MiddleName='" + middleName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", ender='" + gender + '\'' +
                ", BateOfBirth=" + dateOfBirth +
                ", Age='" + age + '\'' +
                ", IsPrimaryInsured='" + isPrimaryInsured + '\'' +
                ", MobileNumber=" + mobileNumber +
                '}';
    }
}