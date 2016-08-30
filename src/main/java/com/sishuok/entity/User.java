package com.sishuok.entity;

import java.io.Serializable;

/**
 * 
 * @author liuyang
 *
 * @since 2016年5月31日上午9:44:56
 */
public class User implements Serializable {

    private static final long serialVersionUID = -4184612532255608530L;
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
