
package com.gbs.compliance.susep.controller;

import com.gbs.compliance.susep.model.SusepEvent;
import com.gbs.compliance.susep.repository.SusepEventRepository;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

@ManagedBean
@SessionScoped
public class SusepEventListManagedBean {
    
    @Inject
    private SusepEventRepository susepEventRepository;
    private List<SusepEvent> susepEventList;
    private SusepEvent selectedItem;
    
    public SusepEventListManagedBean(){
        susepEventList = new ArrayList<>(0);
    }
    
    @PostConstruct
    public void init(){
        susepEventList = susepEventRepository.findAll();
    }

    public List<SusepEvent> getSusepEventList() {
        return susepEventList;
    }

    public void setSusepEventList(List<SusepEvent> susepEventList) {
        this.susepEventList = susepEventList;
    }

    public SusepEvent getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(SusepEvent selectedItem) {
        this.selectedItem = selectedItem;
    }
    
    public void noOp(){
        
    }
    
}
