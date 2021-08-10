package org.zerock.w1.dao;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.w1.dto.StoreDTO;

public class StoreDAOTests {

    private TimeDAO timeDAO = new TimeDAO();

    private StoreDAO storeDAO;

    @BeforeEach
    public void ready() {
        storeDAO = new StoreDAO();
        System.out.println(storeDAO);
    }

    @Test
    public void testInsert() {

        StoreDTO storeDTO = StoreDTO.builder()
                .name("성가네순대국")
                .area("종각")
                .menus("직접 만든 순대, 순대국")
                .build();

        storeDAO.insert(storeDTO);
    }

    @Test
    public void testGetTime() {
        System.out.println(timeDAO.getTime());
    }
}
