package com.ruoyi.system.domain;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName student
 */

@Data
public class Student implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private Integer age;

    /**
     * 
     */
    private Integer belTeacher;


}