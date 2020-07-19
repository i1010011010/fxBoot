package pl.fxboot.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.fxboot.demo.service.DataServiceImpl;

@Controller
public class MainController {
    private DataServiceImpl dataService;

    public MainController() {
    }

    @Autowired
    public MainController(DataServiceImpl dataService) {
        this.dataService = dataService;
    }

    @GetMapping(value = "/AskBid")
    public String getStreamAskPrice(Model model) {
        model.addAttribute("symbol",dataService.getSymbolName("DE30"));
        model.addAttribute("ask", dataService.getAskPrice("DE30"));
        model.addAttribute("bid", dataService.getBidPrice("DE30"));
        return "forex";
    }
}
