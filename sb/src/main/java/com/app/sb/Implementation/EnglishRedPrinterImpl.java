package com.app.sb.Implementation;

import org.springframework.stereotype.Component;

import com.app.sb.Interface.RedPrinter;
@Component
public class EnglishRedPrinterImpl implements RedPrinter{

    @Override
    public String printRed() {
        return " Red ";
    }
    
}
