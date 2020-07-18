package pl.fxboot.demo;

import pl.fxboot.demo.service.FindServiceImpl;

public class TestOtherMethods {

    public static void main(String[] args) {
        FindServiceImpl findServiceImpl = new FindServiceImpl();

//-------------------------------Tests--------------------------------------------------------------
//        System.out.println(findService.findAllSymbolsNames());//pass
//
//        System.out.println(findService.findAllCategories());//pass
//
//        System.out.println(findService.findSymbolsByCategory("FX"));//pass
//
//        System.out.println(findService.findAllGroups());//pass
//
//        System.out.println(findService.findSymbolsByGroup("Crypto"));//pass

        System.out.println(findServiceImpl.getTickPricesRecord(findServiceImpl.findSymbolsByCategory("FX"),1594969800000L));


    }
}

