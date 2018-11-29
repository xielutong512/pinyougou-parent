package com.pinyougou.sellergoods.service.impl;

import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.pinyougou.pojo.TbBrandExample;
import entity.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;

@Service(timeout = 20000)
public class BrandServiceImpl implements BrandService {

	@Autowired
	private TbBrandMapper brandMapper;
	
	@Override
	public List<TbBrand> findAll() {

		return brandMapper.selectByExample(null);
	}

	@Override
	public String name() {
		return "123";
	}

	@Override
	public PageResult findPage(int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);//分页

        Page<TbBrand> page = (Page<TbBrand>) brandMapper.selectByExample(null);

        return new PageResult(page.getTotal(),page.getResult());
	}

    @Override
    public void add(TbBrand brand) {

	    brandMapper.insert(brand);
    }

    @Override
    public TbBrand findOne(Long id) {
        return brandMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(TbBrand brand) {
        brandMapper.updateByPrimaryKey(brand);
    }

    @Override
    public void delete(Long[] ids) {
        for(Long id : ids){
            brandMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public PageResult findPage(TbBrand brand, int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);//分页
        TbBrandExample example = new TbBrandExample();
        if (brand!=null){

            TbBrandExample.Criteria criteria = example.createCriteria();
            if (brand.getName()!=null && brand.getName().length()>0){
                criteria.andNameLike("%"+brand.getName()+"%");
            }
            if (brand.getFirstChar()!=null && brand.getFirstChar().length()>0){
                criteria.andFirstCharEqualTo(brand.getFirstChar());
            }
        }

        Page<TbBrand> page = (Page<TbBrand>) brandMapper.selectByExample(example);

        return new PageResult(page.getTotal(),page.getResult());
    }


}
