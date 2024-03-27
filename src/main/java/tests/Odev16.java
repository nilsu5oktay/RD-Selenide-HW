package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Odev16 extends BaseTest{

    @BeforeMethod
    public void before(){
        pageManager.elementsPage.open();
    }

    @Test
    public void testQAToolsButtonsPage(){
        pageManager.elementsPage.openElementsMeuPages("Buttons")
                .clickMeButtons().verifyClickMeBottonsMesage();
    }

    @Test
    public void testQAToolsWebTables(){
        pageManager.elementsPage.openElementsMeuPages("Web Tables")
                .pressWebTablesButtons("Add")
                .fillFirstName("Nilsu").fillLastName("Oktay").fillEmail("nilsu@oktay.com").fillAge("25").fillSalary("1000").fillDepartment("QATest").pressWebTablesButtons("Submit")
                .pressEntryEdit("nilsu@oktay.com")
                .fillFirstName("Nil").fillLastName("Oktay").fillEmail("nil@oktay.com").fillAge("27").fillSalary("2000").fillDepartment("QAAutomation")
                .pressWebTablesButtons("Submit");
    }

}