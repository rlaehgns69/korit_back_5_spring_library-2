package com.study.library.repository;

import com.study.library.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper {
    public int saveBook(Book book);
    public List<Book> findBooks(
            @Param("startIndex") int startIndex, //Page-유동적으로 페이지번호 구분하기
            @Param("count") int count, // limit startIndex, count
            @Param("bookTypeId") int bookTypeId,
            @Param("categoryId") int categoryId,
            @Param("searchTypeId") int searchTypeId,
            @Param("searchText") String searchText);

    public int getBookCount(
            @Param("bookTypeId") int bookTypeId,
            @Param("categoryId") int categoryId,
            @Param("searchTypeId") int searchTypeId,
            @Param("searchText") String searchText);
}
