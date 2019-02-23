package com.asuka.serivce.Impl;

import com.asuka.Pojo.CommicPic;
import com.asuka.Repositry.PicRepositry;
import com.asuka.serivce.CommicPicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommicPicServiceImpl implements CommicPicService {

    @Autowired
    PicRepositry picRepositry;

    @Override
    public List<CommicPic> getCommicPics(String picSId,String location) {
        return picRepositry.getByCommicIdAndLocationOrderByPageAsc(picSId,location);
    }
}
