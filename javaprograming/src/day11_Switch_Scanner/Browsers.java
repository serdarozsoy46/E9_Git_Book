package day11_Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {

        String browsersName = "chrome";

        String result = "";

       boolean validBrowsers = browsersName == "chrome" || browsersName == "firefox" || browsersName == "opera"
               || browsersName == "safari" || browsersName == "edge";

       if(validBrowsers){
           // 5 Options
          if(browsersName == "chrome"){
           result = "Chrome Browsers is Selected";
          }else if(browsersName == "firefox"){
            result = "FireFox Browsers is Selected";
          }
          else if(browsersName == "opera"){
            result = "Opera Browsers is Selected";
          }
          else if(browsersName == "safari"){
           result = "Safari Browsers is Selected";
          }else{
              result = "Edge Browsers is Selected";
           }
          }else{
           result = "Invalid Browser Name";
          }
        System.out.println(result);
















    }
}
