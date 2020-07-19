package pl.fxboot.demo;

import pl.fxboot.demo.service.FindServiceImpl;

public class TestFindMethods {

    public static void main(String[] args) {
        FindServiceImpl findService = new FindServiceImpl();

//-------------------------------Tests--------------------------------------------------------------
        System.out.println(findService.findAllSymbolsNames());//pass

        System.out.println(findService.findAllCategories());//pass

        System.out.println(findService.findSymbolsByCategory("fx"));//pass

        System.out.println(findService.findAllGroups());//pass

        System.out.println(findService.findSymbolsByGroup("Crypto"));//pass
    }
}

