package ro.iteahome.nhs.backend.model.dto.person;

import ro.iteahome.nhs.backend.model.entity.institution.Institution;

import java.util.Set;

public class NurseDTO {

    private int id;

    private String cnp;

    private String title;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNoRo;

    private String nursingLicenseNo;

    private String specialties;

    private Set<Institution> institutions;

    public NurseDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNoRo() {
        return phoneNoRo;
    }

    public void setPhoneNoRo(String phoneNoRo) {
        this.phoneNoRo = phoneNoRo;
    }

    public String getNursingLicenseNo() {
        return nursingLicenseNo;
    }

    public void setNursingLicenseNo(String nursingLicenseNo) {
        this.nursingLicenseNo = nursingLicenseNo;
    }

    public String getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String specialties) {
        this.specialties = specialties;
    }

    public Set<Institution> getInstitutions() {
        return institutions;
    }

    public void setInstitutions(Set<Institution> institutions) {
        this.institutions = institutions;
    }
}
