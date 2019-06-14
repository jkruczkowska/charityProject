package pl.coderslab.charity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.repository.DonationRepository;

import java.util.List;

@Service
public class DonationSrv {

    @Autowired
    DonationRepository donationRepository;

    public List<Donation> findAllDonations() {
        return donationRepository.findAll();
    }

//    Donation donation = donationRepository.findByCity("plp");
}
