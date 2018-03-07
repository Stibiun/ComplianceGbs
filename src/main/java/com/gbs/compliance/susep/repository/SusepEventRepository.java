package com.gbs.compliance.susep.repository;

import javax.persistence.EntityManager;
import javax.inject.Inject;
import com.gbs.compliance.susep.model.SusepEvent;

public class SusepEventRepository extends AbstractRepository<SusepEvent, Long> {

    @Inject
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SusepEventRepository() {
        super(SusepEvent.class);
    }
}
