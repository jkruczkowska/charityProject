package pl.coderslab.charity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.model.Institution;

import java.util.List;

@Repository
public interface InstitutionRepository extends JpaRepository<Institution, Integer> {

    @Override
    List<Institution> findAll();

    @Override
    Institution getOne(Integer integer);

    Institution findByName(String name);
}
