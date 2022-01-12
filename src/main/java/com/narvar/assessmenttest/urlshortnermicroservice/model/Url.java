package com.narvar.assessmenttest.urlshortnermicroservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Url {

    @Id
    @GeneratedValue
    private long id;

    @Column(name="Long_Url")
    private String longUrl;

    @Column(name="short_Url")
    private String shortUrl;

    public Url(){

    }

    public Url(long id, String longUrl, String shortUrl){
        this.id = id;
        this.longUrl = longUrl;
        this.shortUrl = shortUrl;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        id = id;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }


}
