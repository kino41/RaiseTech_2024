package com.raisetech8.mybatisdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NationalFlowerController {
    private final NationalFlowerService nationalFlowerService;

    public NationalFlowerController(NationalFlowerService nationalFlowerService) {
        this.nationalFlowerService = nationalFlowerService;
    }

    @GetMapping("/national-flowers")
    public List<NationalFlower> get() {
        return nationalFlowerService.findAll();
    }

    @GetMapping("/national-flowers/{name}")
    public NationalFlower findNationalFlower(@PathVariable("name") String name) {
        return nationalFlowerService.findByName(name);
    }
}
