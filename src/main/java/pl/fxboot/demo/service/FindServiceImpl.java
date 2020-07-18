package pl.fxboot.demo.service;

import pl.fxboot.demo.service.auxiliaryservice.ResponseService;
import pl.fxboot.demo.service.interfaces.FindService;
import pro.xstore.api.message.records.SymbolRecord;
import pro.xstore.api.message.records.TickRecord;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindServiceImpl implements FindService {

    public List<String> findAllSymbolsNames() {
        List<String> symbolsNames = new ArrayList<>();
        for (SymbolRecord record : ResponseService.getAllSymbolsResponse().getSymbolRecords())
            symbolsNames.add(record.getSymbol());
        return symbolsNames;
    }

    public Set<String> findAllCategories() {
        Set<String> symbolsNames = new HashSet<>();
        for (SymbolRecord record : ResponseService.getAllSymbolsResponse().getSymbolRecords())
            symbolsNames.add(record.getCategoryName());
        return symbolsNames;
    }

    public Set<String> findAllGroups() {
        Set<String> symbolsNames = new HashSet<>();
        for (SymbolRecord record : ResponseService.getAllSymbolsResponse().getSymbolRecords())
            symbolsNames.add(record.getGroupName());
        return symbolsNames;
    }

    public List<String> findSymbolsByCategory(String category) {
        List<String> categoryList = new ArrayList<>();
        for (SymbolRecord record : ResponseService.getAllSymbolsResponse().getSymbolRecords()) {
            if (record.getCategoryName().equals(category)) {
                categoryList.add(record.getSymbol());
            }
        }
        return categoryList;
    }

    public List<String> findSymbolsByGroup(String group) {
        List<String> groupList = new ArrayList<>();
        for (SymbolRecord record : ResponseService.getAllSymbolsResponse().getSymbolRecords()) {
            if (record.getGroupName().equals(group)) {
                groupList.add(record.getSymbol());
            }
        }
        return groupList;
    }

    public List<Double> getTickPricesRecord(List<String> symbols, Long timestamp) {
        List<Double> tickList = new ArrayList<>();
        for (TickRecord record : ResponseService.getTickPricesResponse(symbols, timestamp).getTicks()) {
            tickList.add(record.getAsk());
        }
        return tickList;
    }
}
