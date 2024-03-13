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

    public List<NationalFlower> findByName(String name) {
        return nationalFlowerMapper.findByName(name);
    }

    public NationalFlower findById(int id) {
        Optional<NationalFlower> nationalFlower = this.nationalFlowerMapper.findById(id);
        if (nationalFlower.isPresent()) {
            return nationalFlower.get();
        } else {
            throw new NationalFlowerNotFoundException("NationalFlower not found");
        }
    }
}
