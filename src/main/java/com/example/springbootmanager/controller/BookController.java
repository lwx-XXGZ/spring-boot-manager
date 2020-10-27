package com.example.springbootmanager.controller;

import com.example.springbootmanager.pojo.Book;
import com.example.springbootmanager.service.BookService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
@Controller
public class BookController {
    @Resource
    private BookService bookService;

    @RequestMapping("/")
    public String show(){
        return "redirect:/a.html";
    }

    @RequestMapping("zzx")
    @ResponseBody
    public PageInfo findAllDUser(Integer pageNo,Integer pageSize){
        PageHelper.offsetPage((pageNo-1)*pageSize,pageSize);
        List<Book> duserList=bookService.getAllBook();
        PageInfo<Book> pageInfo=new PageInfo<Book>(duserList);
        return pageInfo;
    }
    @RequestMapping("delete")
    @ResponseBody
    public Object delete(Integer bookid){
        int a=bookService.removeByPrimaryKey(bookid);
        return a;
    }
    @RequestMapping("select")
    @ResponseBody
    public Object selectByNameAndStatus(String name,Integer Status){
        System.out.println(name);
        List<Book> bookList = bookService.getByNameAndStatus(name,Status);
        System.out.println(bookList.size());
        return bookList;
    }
    @RequestMapping(value = "update")
    public String update(Book book){
        System.out.println(book);
        bookService.changeByPrimaryKeySelective(book);
        return "a";
    }
}
