package com.raisetech8.mybatisdemo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NationalFlowerService {

    private final NationalFlowerMapper nationalFlowerMapper;

    public NationalFlowerService(NationalFlowerMapper nationalflowerMapper) {
        this.nationalFlowerMapper = nationalflowerMapper;
    }

    public List<NationalFlower> findAll() {
        return nationalFlowerMapper.getAll();
    }

    public NationalFlower findByName(String name) {
        Optional<NationalFlower> nationalFlower = this.nationalFlowerMapper.findByName(name);
        if (nationalFlower.isPresent()) {
            return nationalFlower.get();
        } else {
            throw new NationalFlowerNotFoundException("NationalFlower not found");
        }
    }
}
