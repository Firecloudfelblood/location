package com.gyo.location.repos;

import com.gyo.location.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository <Location, Integer>{
}
