package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.repository.DonationRepository;

import java.util.List;

@Service
public class DonationSrv {

    DonationRepository donationRepository;

    List<Donation> donations = donationRepository.findAll();

//    Donation donation = donationRepository.findByCity("plp");
}
