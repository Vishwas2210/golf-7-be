package com.nineleaps.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import java.util.UUID;

import static javax.persistence.FetchType.LAZY;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "owner_table")
public class Owner {

    @Id
    @GeneratedValue
    UUID ownerId;
    @NotEmpty
    String propertyName;
    @NotEmpty
    String address;
    @NotEmpty
    String pincode;
    @NotEmpty
    String city;
    @NotEmpty
    String state;
    @NotEmpty
    String country;

}
