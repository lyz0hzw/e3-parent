package cn.e3mall.service;

import cn.e3mall.common.pojo.EasyUIDataGridResult;
import cn.e3mall.common.utils.E3Result;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemDesc;

public interface ItemService {

	TbItem getItemById(long itemId);

    EasyUIDataGridResult getItemList(Integer page, Integer rows);

    E3Result addItem(TbItem item, String desc);

    TbItemDesc getItemDescById(Long itemId);
}
