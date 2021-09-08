package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.SellerDto;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDto> findAll() {
        return sellerRepository.findAll().stream()
                .map(SellerDto::new)
                .collect(Collectors.toList());
    }
}
