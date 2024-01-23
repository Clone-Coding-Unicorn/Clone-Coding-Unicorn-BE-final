package com.sparta.clonecodingunicorn.domain.news.dto;

import com.sparta.clonecodingunicorn.domain.news.entity.News;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class NewsResponseDto {

    private Long id;

    private String title;

    private String img;

    private String category;

    private LocalDate date;


    public NewsResponseDto(News news) {
        this.id = news.getId();
        this.title = news.getTitle();
        this.img = news.getImgUrl();
        this.category = news.getCategory();
        this.date = news.getNewsDate();
    }
}
