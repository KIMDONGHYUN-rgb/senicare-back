package com.korit.senicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

@Repository
public interface TelAuthNumberRepository extends JpaRepository<TelAuthNumberRepository, String> {
    
}
