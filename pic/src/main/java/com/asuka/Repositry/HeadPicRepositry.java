package com.asuka.Repositry;


import com.asuka.Pojo.HeadPic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeadPicRepositry extends JpaRepository<HeadPic, String> {
    HeadPic getByPicId(Integer picId);

    @Override
    <S extends HeadPic> S save(S entity);
}
