package pl.coderslab.charity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.coderslab.charity.model.Category;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.service.CategorySrv;
import pl.coderslab.charity.service.InstitutionSrv;

import java.util.List;

@Controller
public class DonationController {

    @Autowired
    InstitutionSrv institutionSrv;
    CategorySrv categorySrv;

    public DonationController(InstitutionSrv institutionSrv, CategorySrv categorySrv) {
        this.institutionSrv = institutionSrv;
        this.categorySrv = categorySrv;
    }

@RequestMapping("/donationForm")
    public String showDonationForm(Model model) {

    List<Institution> institutions = institutionSrv.findAllInstitutions();
    int noInstitutions = institutions.size();
    model.addAttribute("noInstitutions", noInstitutions);
    model.addAttribute("institutions", institutions);

    List<Category> categories = categorySrv.findAllCategories();
    model.addAttribute("categories", categories);

    Donation donation = new Donation();
    model.addAttribute("donation", donation);

    return "form";
}

}
