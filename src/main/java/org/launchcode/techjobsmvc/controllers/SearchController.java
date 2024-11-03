package org.launchcode.techjobsmvc.controllers;

import org.launchcode.techjobsmvc.models.JobData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.launchcode.techjobsmvc.controllers.ListController.columnChoices;


/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController {

    @GetMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }

    // TODO #3 - Create a handler to process a search request and render the updated search view.

    @PostMapping(value="search/results")
    public String displaySearchResults (Model model, @RequestParam String searchType, @RequestParam String searchTerm) {

//    If the user enters “all” in the search box, or if they leave the box empty, call the findAll() method from JobData.
        if (searchTerm.toLowerCase()="all") {
            return JobData.findAll();
        } else if (searchTerm="") {
            return JobData.findAll();
        }
//        Otherwise, send the search information to findByColumnAndValue.


        //    In either case, store the results in a jobs ArrayList.
        ArrayList<String, String> somethingSomething = new ArrayList<>();


//                  Pass jobs into the search.html view via the model parameter.
//                  Pass ListController.columnChoices into the view, as the existing search handler does.


        return results;

    }

}

