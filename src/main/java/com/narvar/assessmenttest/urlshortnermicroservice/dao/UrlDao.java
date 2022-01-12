package com.narvar.assessmenttest.urlshortnermicroservice.dao;

import com.narvar.assessmenttest.urlshortnermicroservice.model.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlDao extends JpaRepository<Url, Long> {
    public Url findByShortUrl(String shortUrl);
}
