package com.asuka.serivce.Impl;

import com.asuka.Pojo.Comic;
import com.asuka.repositry.CommicRepository;
import com.asuka.serivce.CommicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommicServiceImpl implements CommicService {

    @Autowired
    CommicRepository commicRepository;

    @Override
    public Comic getOneById(Integer id) {
        return commicRepository.getByCommicId(id);
    }
}
