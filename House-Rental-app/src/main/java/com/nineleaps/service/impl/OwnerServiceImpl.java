package com.nineleaps.service.impl;

import com.nineleaps.model.Owner;
import com.nineleaps.repository.OwnerRepository;
import com.nineleaps.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public Owner addProperty(Owner owner) {
        ownerRepository.save(owner);
        return owner;
    }
}
