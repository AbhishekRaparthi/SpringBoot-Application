// package com.app.sb.Configuration;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import com.app.sb.Implementation.ColorPrinterImpl;
// import com.app.sb.Implementation.HindiBluePrinterImpl;
// import com.app.sb.Implementation.HindiRedPrinterImpl;
// import com.app.sb.Interface.BluePrinter;
// import com.app.sb.Interface.ColorPrinter;
// import com.app.sb.Interface.RedPrinter;

// @Configuration
// public class ColorConfig {

//     @Bean
//     public RedPrinter redPrinter(){
//         return  new HindiRedPrinterImpl();
//     }

//     @Bean
//     public BluePrinter bluePrinter(){
//         return new HindiBluePrinterImpl();
//     }

//     @Bean
//     public ColorPrinter colorPrinter(RedPrinter redPrinter, BluePrinter bluePrinter){
//         return new ColorPrinterImpl(bluePrinter, redPrinter);
//     }   

// }
