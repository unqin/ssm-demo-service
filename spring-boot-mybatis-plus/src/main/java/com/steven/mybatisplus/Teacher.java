package com.steven.mybatisplus;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@TableName(value = "teacher")
@Data
public class Teacher {
    private int id;

    private String teacherName;

    private String teacherPwd;
}
