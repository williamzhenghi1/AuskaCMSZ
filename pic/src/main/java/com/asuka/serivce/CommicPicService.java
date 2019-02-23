package com.asuka.serivce;

import com.asuka.Pojo.CommicPic;

import java.util.List;

public interface CommicPicService {
    List<CommicPic> getCommicPics(String picSId,String location);
}
