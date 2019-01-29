package com.asuka.Pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Data
@Table(name="HeadPic")
public class HeadPic {
    @Id
    @Column(name="PicId")
    private String picId;
    private String Url;
    private Integer Type;
    private Date release_time;
    private Date update_time;
}
