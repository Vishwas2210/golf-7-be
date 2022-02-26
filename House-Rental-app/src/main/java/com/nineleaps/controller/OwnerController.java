package com.nineleaps.controller;

import com.nineleaps.model.Owner;
import com.nineleaps.model.User;
import com.nineleaps.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @PostMapping("/registerProperty")
    public ResponseEntity<?> addProperty(@RequestBody Owner owner) {
        return new ResponseEntity<>(ownerService.addProperty(owner), HttpStatus.OK);
    }

}
