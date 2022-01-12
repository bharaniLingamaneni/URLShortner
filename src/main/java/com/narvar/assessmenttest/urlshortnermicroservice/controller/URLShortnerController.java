package com.narvar.assessmenttest.urlshortnermicroservice.controller;

import com.narvar.assessmenttest.urlshortnermicroservice.model.Url;
import com.narvar.assessmenttest.urlshortnermicroservice.service.UrlShortnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.security.InvalidParameterException;

@RestController
@RequestMapping(value = "/urlshortner")
public class URLShortnerController {

    @Autowired
    private UrlShortnerService urlService;

    @GetMapping(value="/test")
    public String testEndPoint(){
        return "Welcome!!!! Your test endpoint is working...";
    }

    @PostMapping("/generateShortUrl")
    public Url generateShortUrl(@RequestBody String longUrl){
        if(null!=longUrl && longUrl.trim()!=""){
            return urlService.generateShortUrl(longUrl);
        } else {
            throw new InvalidParameterException("Please key in valid URL");
        }
    }

    @GetMapping("/{shortUrl}")
    public Url fetchLongUrl(@PathVariable String shortUrl){
        if(null!=shortUrl && shortUrl.trim()!=""){
            return urlService.fetchLongUrl(shortUrl);
        }else {
            throw new InvalidParameterException("Please key in valid URL");
        }

    }

}
