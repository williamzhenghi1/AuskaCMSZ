package com.asuka.repositry;

import com.asuka.Pojo.Comic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


public interface CommicRepository extends JpaRepository<Comic,Integer> {

    Comic getByCommicId(Integer integer);

    ArrayList<Comic> findByAuthor(String Author);


}
