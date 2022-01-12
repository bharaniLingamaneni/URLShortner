package com.narvar.assessmenttest.urlshortnermicroservice.service;

import com.narvar.assessmenttest.urlshortnermicroservice.model.Url;
import org.springframework.stereotype.Service;

@Service
public interface UrlShortnerService {

    public Url generateShortUrl(String longUrl);
    public Url persistShortenedUrl(Url url);
    public Url fetchLongUrl(String shortUrl);

}
