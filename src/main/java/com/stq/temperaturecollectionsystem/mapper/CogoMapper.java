package com.stq.temperaturecollectionsystem.mapper;

import com.stq.temperaturecollectionsystem.pojo.Cogo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CogoMapper {
    List<Cogo> queryCogoList();

    int addCogo(Cogo cogo);

    int deleteCogo(int aid);
}
