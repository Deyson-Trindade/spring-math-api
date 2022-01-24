package com.project.math.project.controller;

import com.project.math.project.Service.VolumeService;
import com.project.math.project.Service.VolumeServiceImpl;
import com.project.math.project.model.Volume;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/math/volume")
public class VolumeController {


    @PostMapping
    public ResponseEntity<Volume> getVolume(
            @RequestBody @Valid Volume volume) {

        VolumeServiceImpl volumeServiceImpl = new VolumeServiceImpl();
        Volume v = new Volume();

        v = volumeServiceImpl.calculaVolume(volume);

        return new ResponseEntity<Volume>(v, HttpStatus.OK);
    }


}
