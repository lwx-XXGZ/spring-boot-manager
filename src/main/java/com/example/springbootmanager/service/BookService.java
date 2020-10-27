package com.example.springbootmanager.service;

import com.example.springbootmanager.pojo.Book;

import java.util.List;

public interface BookService {
    //获取全部图书信息
    List<Book> getAllBook();

    int removeByPrimaryKey(Integer bookid);

    int addBook(Book record);

    int addSelective(Book record);

    Book getByPrimaryKey(Integer bookid);

    int changeByPrimaryKeySelective(Book record);

    int changeByPrimaryKey(Book record);

    List<Book> getByNameAndStatus(String name,Integer status);
}
