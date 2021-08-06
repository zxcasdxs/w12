package org.zerock.w1.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
public class StoreDTO {

    private String name;
    private String area;
    private String desc;
    private String link;
}
