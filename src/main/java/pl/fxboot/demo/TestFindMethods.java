package pl.fxboot.demo;

import pl.fxboot.demo.service.FindServiceImpl;

public class TestFindMethods {

    public static void main(String[] args) {
        FindServiceImpl findService = new FindServiceImpl();

        System.out.println(findService.findAllSymbolsNames());

        System.out.println(findService.findAllCategories());

        System.out.println(findService.findSymbolsByCategory("fx"));

        System.out.println(findService.findAllGroups());

        System.out.println(findService.findSymbolsByGroup("US"));
    }
}

