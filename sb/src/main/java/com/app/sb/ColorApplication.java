package com.app.sb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.sb.Interface.ColorPrinter;

@SpringBootApplication
public class ColorApplication implements CommandLineRunner{
    private ColorPrinter cp;

    //instead of passing the parameters objects for the implementation , configurations are created
    //using beans and those beans are used whereever the class is called
    ColorApplication(ColorPrinter cp){
        this.cp=cp;
    }

    public static void main(String[] args) {
        SpringApplication.run(ColorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(cp.printColors());
    }
}
