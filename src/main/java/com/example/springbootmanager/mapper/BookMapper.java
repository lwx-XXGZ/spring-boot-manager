package com.example.springbootmanager.mapper;

import com.example.springbootmanager.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer bookid);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookid);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> selectAllBook();

    List<Book> selectByNameAndStatus(@Param("bookName")String name,@Param("status")Integer status);
}