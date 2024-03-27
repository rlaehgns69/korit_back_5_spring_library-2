package com.study.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class SearchBookReqDto {
    private int page;// db에서 select 2번 한페이지 15번씩 들고오면 2번페이지 16 ~ 30 db index 필요
    private int count; //확장성
    private int bookTypeId;
    private int categoryId;
    private int searchTypeId;
    private String searchText;

}
