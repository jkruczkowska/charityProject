package pl.coderslab.charity.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.repository.DonationRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class DonationSrv{

    private final DonationRepository donationRepository;

    
    public List<Donation> findAllDonations() {
        return donationRepository.findAll();
    }


    public void saveDonation(Donation donation) {

    }


//    Donation donation = donationRepository.findByCity("plp");
}
