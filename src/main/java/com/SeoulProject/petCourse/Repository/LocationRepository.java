package com.SeoulProject.petCourse.Repository;

import com.SeoulProject.petCourse.Entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<LocationEntity,Long> {
}
