package com.api.cruddress.controller;


import com.api.cruddress.Dtos.DressDto;
import com.api.cruddress.Services.DressService;
import com.api.cruddress.models.DressModel;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/crudDress")
public class DressController {

    @Autowired
    private DressService dressService;

    @PostMapping("/post")
    public ResponseEntity<Object> saveDress (@RequestBody @Valid DressDto dressDto){
        DressModel dressModel = new DressModel();
        BeanUtils.copyProperties(dressDto, dressModel );
        return ResponseEntity.status(HttpStatus.CREATED).body(dressService.save(dressModel ));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<DressModel>> findAll(){
    return ResponseEntity.status(HttpStatus.OK).body(dressService.findAll());
    }

}
