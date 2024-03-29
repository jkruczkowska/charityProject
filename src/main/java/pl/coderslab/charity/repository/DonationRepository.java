package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.model.Donation;

import java.util.List;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Integer> {

    @Override
    List<Donation> findAll();

    @Override
    Donation getOne(Integer id);

//    Donation findByCity(String city);
}
