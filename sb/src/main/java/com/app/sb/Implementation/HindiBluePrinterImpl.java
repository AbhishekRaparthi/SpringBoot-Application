package com.app.sb.Implementation;

import org.springframework.stereotype.Component;

import com.app.sb.Interface.BluePrinter;

@Component
public class HindiBluePrinterImpl implements BluePrinter{

    public  String printBlue(){
        return "Neela";
    }
    
}
