package com.example.springbootmanager.pojo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book {
    private Integer bookid;

    private String bookname;

    private Integer status;

    private String press;

    private String username;

    private Date borrowdate;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press == null ? null : press.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getBorrowdate() {
        return borrowdate;
    }

    public void setBorrowdate(String borrowdate) throws ParseException {
        this.borrowdate = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(borrowdate);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", status=" + status +
                ", press='" + press + '\'' +
                ", username='" + username + '\'' +
                ", borrowdate=" + borrowdate +
                '}';
    }
}