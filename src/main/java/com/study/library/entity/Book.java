package com.study.library.entity;

import com.study.library.dto.SearchBookRespDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    private int bookId;
    private String bookName;
    private String authorName;
    private String publisherName;
    private String isbn;
    private int bookTypeId;
    private int categoryId;

    private String coverImgUrl;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;

    private BookType bookType;
    private Category category;// resultMap bookType, category Book에 연결

    public SearchBookRespDto toSearchBookRespDto() {
        return SearchBookRespDto.builder()
                .bookId(bookId)
                .bookName(bookName)
                .authorName(authorName)
                .publisherName(publisherName)
                .isbn(isbn)
                .bookTypeId(bookTypeId)
                .bookTypeName(bookType.getBookTypeName())
                .categoryId(categoryId)
                .categoryName(category.getCategoryName())
                .coverImgUrl(coverImgUrl)
                .build();
                //association 객체 name들 dto에서는 바로 Entity면 꺼내써야됨.

    }
}

