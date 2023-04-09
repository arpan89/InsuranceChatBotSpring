package io.swagger.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * PolicyHolder
 */
@Entity
public class PolicyHolderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long policyHolderId;
    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private Long addressId;

    public PolicyHolderEntity() {

    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public PolicyHolderEntity(Long policyHolderId) {
        this.policyHolderId = policyHolderId;
    }

    public Long getPolicyHolderId() {
        return policyHolderId;
    }

    public void setPolicyHolderId(Long policyHolderId) {
        this.policyHolderId = policyHolderId;
    }

    public PolicyHolderEntity firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public PolicyHolderEntity lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PolicyHolderEntity email(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PolicyHolderEntity that = (PolicyHolderEntity) o;
        return policyHolderId.equals(that.policyHolderId) && firstName.equals(that.firstName) && lastName.equals(that.lastName) && email.equals(that.email) && addressId.equals(that.addressId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyHolderId, firstName, lastName, email, addressId);
    }

    @Override
    public String toString() {
        return "PolicyHolder{" +
                "policyHolderId=" + policyHolderId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", addressId=" + addressId +
                '}';
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

