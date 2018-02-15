package java100.app.domain;

import java.sql.Date;

public class Member {
    
    protected int no;
    protected String email;
    protected String password;
    protected String type;
    protected String nickName;
    
    protected String messageId;
    protected String messageFlag;
    
    protected String cancelFlag;
    protected Date regDate;
//    protected MultipartFile photo;
    
    protected Artist artist;
//    
//    protected String interestArea;
//    protected String interestGenre;

    
    public Member() {}

    public Member(int no, String nickName, 
                  String email/*, String interestArea, String interestGenre*/) {
        
        this.no = no;
        this.nickName = nickName;
        this.email = email;
//        this.interestArea = interestArea;
//        this.interestGenre = interestGenre;
        
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageFlag() {
        return messageFlag;
    }

    public void setMessageFlag(String messageFlag) {
        this.messageFlag = messageFlag;
    }

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

//
//    public String getInterestArea() {
//        return interestArea;
//    }
//
//    public void setInterestArea(String interestArea) {
//        this.interestArea = interestArea;
//    }
//
//    public String getInterestGenre() {
//        return interestGenre;
//    }
//
//    public void setInterestGenre(String interestGenre) {
//        this.interestGenre = interestGenre;
//    }

}









