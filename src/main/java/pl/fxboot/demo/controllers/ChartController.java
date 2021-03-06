package pl.fxboot.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.fxboot.demo.service.DataServiceImpl;
import pl.fxboot.demo.service.HistoryServiceImpl;

@Controller
public class ChartController {

    private final HistoryServiceImpl historyService;
    private final DataServiceImpl dataService;


    @Autowired
    public ChartController(HistoryServiceImpl historyService, DataServiceImpl dataService) {
        this.historyService = historyService;
        this.dataService = dataService;
    }

    @GetMapping(value = "/chartTest")
    public String showChart(Model model) {

        model.addAttribute("xPoints", historyService.testGetOpenPricesRange());
        model.addAttribute("yPoints", historyService.testGetPricesTimeRange());
        model.addAttribute("range",historyService.testGetOpenPricesRange().size());
        model.addAttribute("symbol",dataService.getSymbolName("DE30"));
        return "chart";
    }

    @GetMapping(value = "/dataTest")
    public String showData(Model model) {

        model.addAttribute("xPoints", historyService.testGetOpenPricesRange());
        model.addAttribute("yPoints", historyService.testGetPricesTimeRange());
        model.addAttribute("range",historyService.testGetOpenPricesRange().size());
        model.addAttribute("symbol",dataService.getSymbolName("DE30"));
        return "chart_data_test";
    }

}
