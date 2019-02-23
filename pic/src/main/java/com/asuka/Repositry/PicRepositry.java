package com.asuka.Repositry;

import com.asuka.Pojo.CommicPic;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PicRepositry extends JpaRepository<CommicPic,String> {

    List<CommicPic> getByCommicIdAndLocationOrderByPageAsc(String commidId,String location);
}
