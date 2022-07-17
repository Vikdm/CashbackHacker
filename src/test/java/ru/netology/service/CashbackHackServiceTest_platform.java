package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest_platform {

    @Test
    void remain() {
        CashbackHackService cbHS = new CashbackHackService();
        assertEquals(cbHS.remain(400), 600);

    }

    @Test
    void remain2() {
        CashbackHackService cbHS = new CashbackHackService();
        assertEquals(cbHS.remain(1000), 0);

    }

    @Test
    void remain3() {
        CashbackHackService cbHS = new CashbackHackService();
        assertEquals(cbHS.remain(1), 999);

    }
}