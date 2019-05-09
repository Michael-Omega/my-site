package cn.louiswu.dto;

import cn.louiswu.model.MetaDomain;

/**
 * 标签、分类列表
 * Created by LouisWu on 2018/11/30.
 */
public class MetaDto extends MetaDomain {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
