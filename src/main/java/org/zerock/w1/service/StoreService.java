package org.zerock.w1.service;

import org.zerock.w1.dto.StoreDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public enum StoreService {

    INSTANCE;

    private List<StoreDTO> dtoList;

    StoreService(){
        this.dtoList = new ArrayList<>();
    }

    public void add(StoreDTO storeDTO) {
        this.dtoList.add(storeDTO);
    }

    public List<StoreDTO> getDtoList(String area) {

        if (area == null || area.trim().length() == 0) {
            return this.dtoList;
        }
        return this.dtoList.stream().filter(storeDTO -> storeDTO.getArea().equals(area))
                .collect(Collectors.toList());
    }
}
