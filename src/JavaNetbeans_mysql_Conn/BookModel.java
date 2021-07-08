/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaNetbeans_mysql_Conn;

/**
 *
 * @author DELL
 */
public class BookModel {
    
    String BookName,AuthorName,Isbn,pubDate;
    public String getBookName(){
        return BookName;
    }
    
    public void setBookName(String BookName){
        this.BookName = BookName;
    }
    
    public String getAuthorName(){
        return AuthorName;
    }
    
    public void setAuthorName(String AuthorName){
        this.AuthorName = AuthorName;
    }
    
    public String getIsbn(){
        return Isbn;
    }
    
    public void setIsbn(String Isbn){
        this.Isbn = Isbn;
    }
    
    public String getpubDate(){
        return pubDate;
    }
    
    public void setpubDate(String pubDate ){
        this.pubDate = pubDate;
    }
    
    
}

