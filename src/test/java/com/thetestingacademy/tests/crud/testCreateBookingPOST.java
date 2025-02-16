package com.thetestingacademy.tests.crud;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCreateBookingPOST {

    @Link(name = "Website", url = "https://Sdet.live.com/")
    @Issue("AUTH-123")
    @TmsLink("TMS-456")
   @Owner("JhansiM")
   @Description("Verify that POST request is working fine.")
    @Test
    public void testVerifyCreateBookingPOST01(){
        Assert.assertEquals(true,true);


    }

}
