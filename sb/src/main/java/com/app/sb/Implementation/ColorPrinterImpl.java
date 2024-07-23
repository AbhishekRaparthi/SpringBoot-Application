package com.app.sb.Implementation;

import org.springframework.stereotype.Component;

import com.app.sb.Interface.BluePrinter;
import com.app.sb.Interface.ColorPrinter;
import com.app.sb.Interface.RedPrinter;

@Component
public class ColorPrinterImpl implements ColorPrinter{

    private BluePrinter blueprinter;
    private RedPrinter redPrinter;
    
    public ColorPrinterImpl(BluePrinter blueprinter, RedPrinter redPrinter){
        this.blueprinter=blueprinter;
        this.redPrinter=redPrinter;
    }

    @Override
    public String printColors() {
        return blueprinter.printBlue()+","+redPrinter.printRed();
    }

    

}
