package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain1() {
        CashbackHackService cbHS = new CashbackHackService();
        cbHS.remain(400);

        assertEquals(cbHS.remain(400), 600);
    }

    @org.testng.annotations.Test
    public void testRemain2() {
        CashbackHackService cbHS = new CashbackHackService();

        assertEquals(cbHS.remain(1000), 0);
    }

    @org.testng.annotations.Test
    public void testRemain3() {
        CashbackHackService cbHS = new CashbackHackService();

        assertEquals(cbHS.remain(1), 999);

    }
}