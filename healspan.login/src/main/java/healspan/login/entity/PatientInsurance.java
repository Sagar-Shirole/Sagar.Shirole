package healspan.login.entity;

import javax.persistence.*;

@Entity
@Table(name = "patient_insurance_info", schema = "Healspan")
public class PatientInsurance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pii_id" , unique = true)
    private Long patientInsuranceId;

    @Column(name = "pii_insurance_company" , unique = true)
    private String insuranceCompany;

    @Column(name = "pii_tpa_name", unique = true)
    private String tpaName;

    @Column(name = "pii_tpa_id", unique = true)
    private Long tpaId;

    @Column(name = "pii_policy_holder_name", unique = true)
    private String policyHolderName;

    @Column(name = "pii_policy_number", unique = true)
    private Long policyNumber;

    @Column(name = "pii_patient_relation", unique = true)
    private String patientRelation;

    @Column(name = "pii_is_group_policy", unique = true)
    private boolean isGroupPolicy;

    @Column(name = "pii_group_name", unique = true)
    private String groupName;

    @Column(name = "pii_claim_id", unique = true)
    private Long claimId;

    public PatientInsurance() {
    }

    public PatientInsurance(Long patientInsuranceId, String insuranceCompany, String tpaName, Long tpaId, String policyHolderName, Long policyNumber, String patientRelation, boolean isGroupPolicy, String groupName, Long claimId) {
        this.patientInsuranceId = patientInsuranceId;
        this.insuranceCompany = insuranceCompany;
        this.tpaName = tpaName;
        this.tpaId = tpaId;
        this.policyHolderName = policyHolderName;
        this.policyNumber = policyNumber;
        this.patientRelation = patientRelation;
        this.isGroupPolicy = isGroupPolicy;
        this.groupName = groupName;
        this.claimId = claimId;
    }

    public Long getPatientInsuranceId() {
        return patientInsuranceId;
    }

    public void setPatientInsuranceId(Long patientInsuranceId) {
        this.patientInsuranceId = patientInsuranceId;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getTpaName() {
        return tpaName;
    }

    public void setTpaName(String tpaName) {
        this.tpaName = tpaName;
    }

    public Long getTpaId() {
        return tpaId;
    }

    public void setTpaId(Long tpaId) {
        this.tpaId = tpaId;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public Long getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(Long policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPatientRelation() {
        return patientRelation;
    }

    public void setPatientRelation(String patientRelation) {
        this.patientRelation = patientRelation;
    }

    public boolean isGroupPolicy() {
        return isGroupPolicy;
    }

    public void setGroupPolicy(boolean groupPolicy) {
        isGroupPolicy = groupPolicy;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Long getClaimId() {
        return claimId;
    }

    public void setClaimId(Long claimId) {
        this.claimId = claimId;
    }

}
