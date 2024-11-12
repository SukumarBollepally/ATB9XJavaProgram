package Nov2024.Ex07112024_OOPS_Inheritance.Single_Inheritance.Real;


    public class TestCase1 extends Common_BaseTest {
        public TestCase1(){
            System.out.println("DC - Child");
        }

        public void testcase(){
            startBrowser();
            readExcelFile();
            closeBrowser();
        }
}
