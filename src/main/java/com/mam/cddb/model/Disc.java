package com.mam.cddb.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disc {

    @Id
    private String id;
    private String title;

    public Disc(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
