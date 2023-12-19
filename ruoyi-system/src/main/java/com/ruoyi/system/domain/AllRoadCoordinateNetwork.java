package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 all_road_coordinate_network
 * 
 * @author ruoyi
 * @date 2023-12-18
 */
public class AllRoadCoordinateNetwork extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double gaodeX;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double gaodeY;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String roadid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setGaodeX(Double gaodeX)
    {
        this.gaodeX = gaodeX;
    }

    public Double getGaodeX()
    {
        return gaodeX;
    }
    public void setGaodeY(Double gaodeY)
    {
        this.gaodeY = gaodeY;
    }

    public Double getGaodeY()
    {
        return gaodeY;
    }
    public void setRoadid(String roadid) 
    {
        this.roadid = roadid;
    }

    public String getRoadid() 
    {
        return roadid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("gaodeX", getGaodeX())
            .append("gaodeY", getGaodeY())
            .append("roadid", getRoadid())
            .toString();
    }
}
