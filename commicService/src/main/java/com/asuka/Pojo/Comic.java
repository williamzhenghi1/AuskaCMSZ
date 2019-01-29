package com.asuka.Pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "Comic")
public class Comic {
    @Id
    @Column(name = "CommicId")
    private Integer commicId;
    @Column(name = "Author")
    private String author;
    private String isFinish;
    private String content;
    private String Category;
    private String Rate;
    private String HeadPicUrl;
    private Integer Chapter;
    private Date created_at;
    private Date updated_at;

}
