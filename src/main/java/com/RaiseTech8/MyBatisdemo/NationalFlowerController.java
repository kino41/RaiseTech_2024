package com.raisetech8.mybatisdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NationalFlowerController {
    private NationalFlowerMapper nameMapper;

    public NationalFlowerController(NationalFlowerMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @GetMapping("/national-flowers")
    public List<NationalFlower> nationalFlower() {
        List<NationalFlower> nationalFlower = nameMapper.findAll();
        return nationalFlower;
    }
}
