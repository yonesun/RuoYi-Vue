package com.ruoyi.web.controller.drawRoadCenter;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Gpshisdata;
import com.ruoyi.system.service.IGpshisdataService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2024-01-11
 */
@RestController
@RequestMapping("/system/gpshisdata")
public class GpshisdataController extends BaseController
{
    @Autowired
    private IGpshisdataService gpshisdataService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:gpshisdata:list')")
    @GetMapping("/list")
    public TableDataInfo list(Gpshisdata gpshisdata)
    {
        List<Gpshisdata> list = gpshisdataService.selectGpshisdataList(gpshisdata);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:gpshisdata:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Gpshisdata gpshisdata)
    {
        List<Gpshisdata> list = gpshisdataService.selectGpshisdataList(gpshisdata);
        ExcelUtil<Gpshisdata> util = new ExcelUtil<Gpshisdata>(Gpshisdata.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:gpshisdata:query')")
    @GetMapping(value = "/{VEHICLENO}")
    public AjaxResult getInfo(@PathVariable("VEHICLENO") String VEHICLENO)
    {
        return success(gpshisdataService.selectGpshisdataByVEHICLENO(VEHICLENO));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:gpshisdata:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Gpshisdata gpshisdata)
    {
        return toAjax(gpshisdataService.insertGpshisdata(gpshisdata));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:gpshisdata:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Gpshisdata gpshisdata)
    {
        return toAjax(gpshisdataService.updateGpshisdata(gpshisdata));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:gpshisdata:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{VEHICLENOs}")
    public AjaxResult remove(@PathVariable String[] VEHICLENOs)
    {
        return toAjax(gpshisdataService.deleteGpshisdataByVEHICLENOs(VEHICLENOs));
    }
}
