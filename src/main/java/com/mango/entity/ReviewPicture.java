package com.mango.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
@RequiredArgsConstructor
@Table(name = "ReviewPicture")
public class ReviewPicture {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Review_Id")
    private Review review;


    @Column(name = "Review_Pic_Url")
    private String reviewPicUrl;
}
