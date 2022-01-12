package com.narvar.assessmenttest.urlshortnermicroservice.service;

import com.narvar.assessmenttest.urlshortnermicroservice.dao.UrlDao;
import com.narvar.assessmenttest.urlshortnermicroservice.model.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.google.common.hash.Hashing;
import java.nio.charset.StandardCharsets;

@Component
public class UrlShortnerServiceImpl implements UrlShortnerService{

    @Autowired
    private UrlDao urlDao;

    @Override
    public Url generateShortUrl(String longUrl) {
            String encodeUrl =  Hashing.murmur3_32().hashString(longUrl,StandardCharsets.UTF_8).toString();
            Url persistModel = new Url();
            persistModel.setLongUrl(longUrl);
            persistModel.setShortUrl(encodeUrl);
            return persistShortenedUrl(persistModel);

    }

    @Override
    public Url persistShortenedUrl(Url url){
        return urlDao.save(url);
    }

    @Override
    public Url fetchLongUrl(String shortUrl){
        return urlDao.findByShortUrl(shortUrl);
    }
}
