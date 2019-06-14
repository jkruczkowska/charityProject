package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.repository.InstitutionRepository;

import java.util.List;

@Service
public class InstitutionSrv {

    InstitutionRepository institutionRepository;

    List<Institution> institutions = institutionRepository.findAll();

//    Institution institution = institutionRepository.getOne(1);
//
//    Institution institutionByName = institutionRepository.findByName("Dar");
}
