package com.asuka.Pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name = "CommicPic")
public class CommicPic {
    @Id
    @Column(name = "PicID")
    private Integer picId;
    private String Url;
    private String commicId;
    private String location;
    private int page;
    private Integer Type;
    private Date release_time;
    private Date update_time;
}
