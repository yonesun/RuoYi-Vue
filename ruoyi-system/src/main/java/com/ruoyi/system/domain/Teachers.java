package com.ruoyi.system.domain;
import lombok.Data;
import java.io.Serializable;
import java.util.List;

/**
 * 
 * @TableName teachers
 */
@Data
public class Teachers implements Serializable {
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

    private List<Student> students;

}