package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 gpshisdata
 * 
 * @author ruoyi
 * @date 2024-01-11
 */
public class Gpshisdata extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String VEHICLENO;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date DATATIME;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String SIMCARDNO;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ISRELIABLE;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String LONGITUDE;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String LATITUDE;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long SPEED;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long VEHICLEANGLE;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long VEHICLEALARM;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long WORKALARM;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ROADID;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String ROADDIRECTION;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long BEFLONGITUDE;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long BEFLATITUDE;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long ROADLOCATION;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double gaodeX;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Double gaodeY;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String gjId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String gjDir;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String gjStake;

    public void setVEHICLENO(String VEHICLENO) 
    {
        this.VEHICLENO = VEHICLENO;
    }

    public String getVEHICLENO() 
    {
        return VEHICLENO;
    }
    public void setDATATIME(Date DATATIME) 
    {
        this.DATATIME = DATATIME;
    }

    public Date getDATATIME() 
    {
        return DATATIME;
    }
    public void setSIMCARDNO(String SIMCARDNO) 
    {
        this.SIMCARDNO = SIMCARDNO;
    }

    public String getSIMCARDNO() 
    {
        return SIMCARDNO;
    }
    public void setISRELIABLE(String ISRELIABLE) 
    {
        this.ISRELIABLE = ISRELIABLE;
    }

    public String getISRELIABLE() 
    {
        return ISRELIABLE;
    }
    public void setLONGITUDE(String LONGITUDE) 
    {
        this.LONGITUDE = LONGITUDE;
    }

    public String getLONGITUDE() 
    {
        return LONGITUDE;
    }
    public void setLATITUDE(String LATITUDE) 
    {
        this.LATITUDE = LATITUDE;
    }

    public String getLATITUDE() 
    {
        return LATITUDE;
    }
    public void setSPEED(Long SPEED) 
    {
        this.SPEED = SPEED;
    }

    public Long getSPEED() 
    {
        return SPEED;
    }
    public void setVEHICLEANGLE(Long VEHICLEANGLE) 
    {
        this.VEHICLEANGLE = VEHICLEANGLE;
    }

    public Long getVEHICLEANGLE() 
    {
        return VEHICLEANGLE;
    }
    public void setVEHICLEALARM(Long VEHICLEALARM) 
    {
        this.VEHICLEALARM = VEHICLEALARM;
    }

    public Long getVEHICLEALARM() 
    {
        return VEHICLEALARM;
    }
    public void setWORKALARM(Long WORKALARM) 
    {
        this.WORKALARM = WORKALARM;
    }

    public Long getWORKALARM() 
    {
        return WORKALARM;
    }
    public void setROADID(String ROADID) 
    {
        this.ROADID = ROADID;
    }

    public String getROADID() 
    {
        return ROADID;
    }
    public void setROADDIRECTION(String ROADDIRECTION) 
    {
        this.ROADDIRECTION = ROADDIRECTION;
    }

    public String getROADDIRECTION() 
    {
        return ROADDIRECTION;
    }
    public void setBEFLONGITUDE(Long BEFLONGITUDE) 
    {
        this.BEFLONGITUDE = BEFLONGITUDE;
    }

    public Long getBEFLONGITUDE() 
    {
        return BEFLONGITUDE;
    }
    public void setBEFLATITUDE(Long BEFLATITUDE) 
    {
        this.BEFLATITUDE = BEFLATITUDE;
    }

    public Long getBEFLATITUDE() 
    {
        return BEFLATITUDE;
    }
    public void setROADLOCATION(Long ROADLOCATION) 
    {
        this.ROADLOCATION = ROADLOCATION;
    }

    public Long getROADLOCATION() 
    {
        return ROADLOCATION;
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
    public void setGjId(String gjId) 
    {
        this.gjId = gjId;
    }

    public String getGjId() 
    {
        return gjId;
    }
    public void setGjDir(String gjDir) 
    {
        this.gjDir = gjDir;
    }

    public String getGjDir() 
    {
        return gjDir;
    }
    public void setGjStake(String gjStake) 
    {
        this.gjStake = gjStake;
    }

    public String getGjStake() 
    {
        return gjStake;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("VEHICLENO", getVEHICLENO())
            .append("DATATIME", getDATATIME())
            .append("SIMCARDNO", getSIMCARDNO())
            .append("ISRELIABLE", getISRELIABLE())
            .append("LONGITUDE", getLONGITUDE())
            .append("LATITUDE", getLATITUDE())
            .append("SPEED", getSPEED())
            .append("VEHICLEANGLE", getVEHICLEANGLE())
            .append("VEHICLEALARM", getVEHICLEALARM())
            .append("WORKALARM", getWORKALARM())
            .append("ROADID", getROADID())
            .append("ROADDIRECTION", getROADDIRECTION())
            .append("BEFLONGITUDE", getBEFLONGITUDE())
            .append("BEFLATITUDE", getBEFLATITUDE())
            .append("ROADLOCATION", getROADLOCATION())
            .append("gaodeX", getGaodeX())
            .append("gaodeY", getGaodeY())
            .append("gjId", getGjId())
            .append("gjDir", getGjDir())
            .append("gjStake", getGjStake())
            .append("createTime", getCreateTime())
            .toString();
    }
}
