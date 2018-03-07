
package com.gbs.compliance.susep.controller;

import com.gbs.compliance.susep.model.SusepEvent;
import com.gbs.compliance.susep.repository.SusepEventRepository;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SusepEventListManagedBean {
    
    @EJB
    private SusepEventRepository susepEventRepository;
    List<SusepEvent> susepEventList;
    
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
    
}
