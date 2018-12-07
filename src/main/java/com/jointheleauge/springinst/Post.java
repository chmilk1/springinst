package com.jointheleauge.springinst;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by league on 12/6/18.
 */
@Entity
public class Post {

    @Id @GeneratedValue
    Long id;

    String title;
    String body;
    Date postedOn;

    protected Post(Long id, String title, String body, Date postedOn) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.postedOn = postedOn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(Date postedOn) {
        this.postedOn = postedOn;
    }
}
