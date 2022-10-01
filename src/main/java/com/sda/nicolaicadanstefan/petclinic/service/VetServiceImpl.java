package com.sda.nicolaicadanstefan.petclinic.service;

import com.sda.nicolaicadanstefan.petclinic.model.Vet;
import com.sda.nicolaicadanstefan.petclinic.repository.VetRepository;

import java.util.List;

public class VetServiceImpl implements VetService {
    private final VetRepository vetRepository;

    public VetServiceImpl(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public void createVet(String firstName, String lastName, String address, String speciality) {
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First Name is INVALID");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last Name is INVALID");
        }
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address is INVALID");
        }
        if (speciality == null || speciality.isBlank()) {
            throw new IllegalArgumentException("Speciality is INVALID");
        }
        vetRepository.createVet(firstName, lastName, address, speciality);
    }

    public List<Vet> getAllVets(){
        return vetRepository.getAllVets();
    }
}
