package Nov2024.Ex07112024_OOPS_Inheritance.Single_Inheritance.Real;

    public class TestCase2 extends Common_BaseTest {
        TestCase2(){
            System.out.println("DC - Child");
        }

        void testcase2(){
            startBrowser();
            System.out.println("TC2 Executing");
            readExcelFile();
            closeBrowser();
        }
}
