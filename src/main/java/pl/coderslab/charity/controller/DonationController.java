package pl.coderslab.charity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.Category;
import pl.coderslab.charity.model.Donation;
import pl.coderslab.charity.model.Institution;
import pl.coderslab.charity.service.CategorySrv;
import pl.coderslab.charity.service.DonationSrv;
import pl.coderslab.charity.service.InstitutionSrv;

import java.util.List;

@Controller
public class DonationController {

    @Autowired
    InstitutionSrv institutionSrv;
    CategorySrv categorySrv;
    DonationSrv donationSrv;

    public DonationController(InstitutionSrv institutionSrv, CategorySrv categorySrv, DonationSrv donationSrv) {
        this.institutionSrv = institutionSrv;
        this.categorySrv = categorySrv;
        this.donationSrv = donationSrv;
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

        return "form1";
    }

    @RequestMapping("/summary")
    public String showSummary(Model model) {


        return "summary";
    }

    @RequestMapping("/formConf")
    public String showConfirmation(Model model) {
        donationSrv.saveDonation(new Donation());
        return "form-confirmation";
    }

}
