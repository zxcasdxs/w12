package org.zerock.w1.dto;

import lombok.*;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
public class StoreDTO {

    private Long sno;
    private String name;
    private String area;
    private String menus;
    private String link;
    private Timestamp regDate;
    private Timestamp modDate;

}
