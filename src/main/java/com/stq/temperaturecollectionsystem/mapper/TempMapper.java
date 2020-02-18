package com.stq.temperaturecollectionsystem.mapper;

import com.stq.temperaturecollectionsystem.pojo.Temp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TempMapper {
    List<Temp> queryTempList();

    int addTemp(Temp temp);

    int deleteTemp(int tid);
}
