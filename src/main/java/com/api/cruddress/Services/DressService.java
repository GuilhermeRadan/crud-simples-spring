package com.api.cruddress.Services;


import com.api.cruddress.models.DressModel;
import com.api.cruddress.repositories.DressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DressService {


    @Autowired
    private DressRepository dressRepository;

    public DressModel save(DressModel dresSModel) {
        return dressRepository.save(dresSModel );
    }

    public List<DressModel> findAll(){
        return dressRepository.findAll();
    }
}
