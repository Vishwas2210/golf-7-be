package com.nineleaps.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "owner_table")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long ownerId;


    @Column(name = "house_no", nullable = false)
    private String houseNo;
    @Column(name = "block_no",nullable = false)
    private String blockNo;
    @Column(name = "address")
    private String address;
    @Column(name = "pincode")
    private String pincode;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "country")
    private String country;


}
