package com.gyo.location.repos;

import com.gyo.location.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LocationRepository extends JpaRepository <Location, Integer>{

    @Query("select count(type) from location group by type")
    public List<Object[]> findTypeAndTypeCount();
}
