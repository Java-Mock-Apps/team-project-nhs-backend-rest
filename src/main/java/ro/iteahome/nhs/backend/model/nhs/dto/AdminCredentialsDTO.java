package ro.iteahome.nhs.backend.model.nhs.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class AdminCredentialsDTO { // TODO: Figure out if this is useful anymore.

// FIELDS: -------------------------------------------------------------------------------------------------------------

    // NO ID.

    @NotNull(message = "EMAIL CANNOT BE EMPTY.")
    @Email(regexp = ".+@.+\\.\\w+", message = "INVALID EMAIL ADDRESS")
    private String email;

    @NotNull(message = "PASSWORD CANNOT BE EMPTY.")
    @Pattern(regexp = "((?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]).{8,32})", message = "INVALID PASSWORD")
    private String password;

    // NO FIRST NAME.

    // NO LAST NAME.

    // NO PHONE NUMBER.

    // NO STATUS.

    // NO ROLE.

// METHODS: ------------------------------------------------------------------------------------------------------------

    public AdminCredentialsDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}