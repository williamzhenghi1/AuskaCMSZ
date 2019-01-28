package com.asuka.serivce.Impl;


import com.asuka.Pojo.HeadPic;
import com.asuka.Repositry.HeadPicRepositry;
import com.asuka.serivce.HeadPicSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeadPicServiceImpl implements HeadPicSerivce {

    @Autowired
    HeadPicRepositry headPicRepositry;

    @Override
    public HeadPic getOneHeadPic(Integer integer) {
        return headPicRepositry.getByPicId(integer);
    }
}
