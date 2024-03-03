package com.raisetech8.mybatisdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {
    private NameMapper nameMapper;

    public NameController(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @GetMapping("/national-flower")
    public List<Name> national_flower() {
        List<Name> national_flower = nameMapper.findAll();
        return national_flower;
    }
}
