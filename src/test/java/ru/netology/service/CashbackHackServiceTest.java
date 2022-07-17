package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void remain() {
        CashbackHackService cbHS = new CashbackHackService();
        assertEquals(cbHS.remain(400), 600);

    }

    @org.junit.Test
    public void remain2() {
        CashbackHackService cbHS = new CashbackHackService();
        assertEquals(cbHS.remain(1000), 0);

    }

    @org.junit.Test
    public void remain3() {
        CashbackHackService cbHS = new CashbackHackService();
        assertEquals(cbHS.remain(1), 999);

    }
}