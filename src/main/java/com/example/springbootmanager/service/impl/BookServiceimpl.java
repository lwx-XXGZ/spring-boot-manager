package com.example.springbootmanager.service.impl;

import com.example.springbootmanager.pojo.Book;
import com.example.springbootmanager.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceimpl implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Override
    public List<Book> getAllBook() {
        return bookMapper.selectAllBook();
    }

    @Override
    public int removeByPrimaryKey(Integer bookid) {
        return bookMapper.deleteByPrimaryKey(bookid);
    }

    @Override
    public int addBook(Book record) {
        return bookMapper.insert(record);
    }

    @Override
    public int addSelective(Book record) {
        return bookMapper.insertSelective(record);
    }

    @Override
    public Book getByPrimaryKey(Integer bookid) {
        return bookMapper.selectByPrimaryKey(bookid);
    }

    @Override
    public int changeByPrimaryKeySelective(Book record) {
        return bookMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int changeByPrimaryKey(Book record) {
        return bookMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Book> getByNameAndStatus(String name, Integer status) {
        return bookMapper.selectByNameAndStatus(name, status);
    }
}
