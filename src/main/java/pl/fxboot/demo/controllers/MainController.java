package pl.fxboot.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.fxboot.demo.service.DataServiceImpl;
import pl.fxboot.demo.service.StreamDataServiceImpl;

@Controller
public class MainController {
    private DataServiceImpl dataService;
    private StreamDataServiceImpl streamDataService;

    public MainController() {
    }

    @Autowired
    public MainController(DataServiceImpl dataService, StreamDataServiceImpl streamDataService) {
        this.dataService = dataService;
        this.streamDataService = streamDataService;
    }

    @GetMapping(value = "/Ask")
    public String getAskPrice(Model model) {
        model.addAttribute("askPrice", dataService.getAskPrice("DE30"));
        return "forex";
    }

    @GetMapping(value = "/Bid")
    public String getBidPrice(Model model) {
        model.addAttribute("bidPrice", dataService.getBidPrice("DE30"));
        return "forex";
    }

    @GetMapping(value = "/AskBid")
    public String getStreamAskPrice(Model model) {
        model.addAttribute("ask", dataService.getAskPrice("DE30"));
        model.addAttribute("bid", dataService.getBidPrice("DE30"));
        return "forex";
    }
}
