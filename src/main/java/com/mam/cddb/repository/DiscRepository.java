package com.mam.cddb.repository;

import com.mam.cddb.model.Disc;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DiscRepository extends CrudRepository<Disc, String> {

        List<Disc> findByTitle(String title);

}
