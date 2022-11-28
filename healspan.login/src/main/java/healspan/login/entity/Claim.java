package healspan.login.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="claim_master" ,schema = "Healspan")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="clm_id" , unique = true)
    private Long claimId;

    @Column(name="clm_healspan_id")
    private Long healspanId;

    @Column(name="clm_claim_id")
    private Long tpaClaimId;

    @Column(name="clm_created_by")
    private String createdBy;

    @Column(name="clm_created_datetime")
    private LocalDateTime createdDatetime;

    @Column(name="clm_csm_id")
    private Long claimStageMasterId;

    @Column(name="clm_pi_id")
    private Long patientInformationId;

    @Column(name="clm_pii_id")
    private Long patientInsuranceInfoId;

    @Column(name="clm_mi_id")
    private Long patientMedicalInfoId;


            clm_status_id
    clm_pending_with
            clm_admission_date
    clm_expected_discharge_date
            clm_ailment
    clm_estimated_bill_amount
            clm_cost_per_day
    clm_treatment_type
            clm_proposed_claim_amount
    clm_final_claim_amount
            clm_final_bill
}
