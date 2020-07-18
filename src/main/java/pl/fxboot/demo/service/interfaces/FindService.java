package pl.fxboot.demo.service.interfaces;

import java.util.List;
import java.util.Set;

public interface FindService {

    List<String> findAllSymbolsNames();

    Set<String> findAllCategories();

    Set<String> findAllGroups();

    List<String> findSymbolsByCategory(String category);

    List<String> findSymbolsByGroup(String group);
}
