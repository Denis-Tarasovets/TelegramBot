package com.example.tgbot.repository;

import com.example.tgbot.entity.Income;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;
import java.util.Optional;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@DataJpaTest

public class IncomeRepositoryTest {

    @Autowired
    private IncomeRepository incomeRepository;

    @Test
    public void testDataScripts() {
        Optional<Income> income = incomeRepository.findById(123L);
        assertTrue(income.isPresent());
        assertEquals(new BigDecimal("789.00"), income.get().getIncome());
    }
}
