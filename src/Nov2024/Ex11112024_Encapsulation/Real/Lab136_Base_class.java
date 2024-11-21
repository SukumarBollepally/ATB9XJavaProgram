package Nov2024.Ex11112024_Encapsulation.Real;

public class Lab136_Base_class {

    private String browser;


    Lab136_Base_class(){
        System.out.println("DC - BaseClass");
    }

    Lab136_Base_class(String b){
        System.out.println("CC - BaseClass");
    }


    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;
        }else{
            System.out.println("Not Allowed");
        }
    }

    void openBrowser() {
        System.out.println("Opening Browser!!");

//        Webdriver driver = new ChromeDriver();
//        driver.get("url");
//
    }

    void openBrowser(String browserName) {
        System.out.println("Open Browser!! -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("Close Browser!!");


    }



}

